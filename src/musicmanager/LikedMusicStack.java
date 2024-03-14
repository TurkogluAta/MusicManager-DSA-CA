/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package musicmanager;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Ata Turkoglu
 */
public class LikedMusicStack implements StackInterface, Serializable {
    private ArrayList<String> myStack;
    
    
    // Create a new instance of Stack
    public LikedMusicStack() {
        myStack = new ArrayList<String>();
    }
    
    public int size() {
        return myStack.size();
    }
    
    public boolean isEmpty() {
        return myStack.isEmpty();
    }

    public boolean isFull() {
        return false;
    }
    
    //(myStack.size() - 1))
    public Object pop() {
        if(!myStack.isEmpty()){
            return myStack.remove(0);
        } else {
            return null;
        }
    }
    
    //(myStack.size() - 1))
    public Object peek() {
        if(!myStack.isEmpty()){
           return myStack.get(0);
        } else {
            return null;
        }
    }
    
    //(myStack.size() - 1))
    public void push(Object newMusic) {
        myStack.add(0, (String) newMusic);
    }

    public void emptyStack() {
       while(!myStack.isEmpty()){
           pop();
       }
    }

    /* 
    
    The function of the method is to add the elements in the ArrayList to a 
    String and return them by concatenating them. This method is functionally 
    correct and produces the desired result; However, it has some minor drawbacks
    when considered in terms of performance and writing style.
    
    When concat is used, it means that a new String object is created for each 
    concatenation, which can increase memory usage and processing load.
    
    public String displayStack() {
        String sResult = " ";
        for (int i=0; i<theStack.size(); i++){
           sResult = sResult.concat(theStack.get(i) + " \n ");
        }
        return(sResult);
    }
    */
    
    /* On the other hand, StringBuilder's append method directly adds value to 
    the existing buffer and does not create a new String object. This means better
    performance, especially when working with large data sets.
    */

    public String displayStack() {
        StringBuilder displayBuilder = new StringBuilder();
        displayBuilder.append("Songs in your liked songs list: \n");
        for(String musicItem : myStack) {
            displayBuilder.append(musicItem);
            displayBuilder.append("\n");
        }
        return displayBuilder.toString();
    }
}
