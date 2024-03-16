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

    private ArrayList<musicData> myStack; // Holds liked songs

    // Constructor initializes the stack
    public LikedMusicStack() {
        myStack = new ArrayList<>();
    }

    // Returns the number of songs in the stack
    public int size() {
        return myStack.size();
    }

    // Checks if the stack is empty
    public boolean isEmpty() {
        return myStack.isEmpty();
    }

    // Always returns false
    public boolean isFull() {
        return false;
    }

    // Removes and returns the top item from the stack
    public musicData pop() {
        if (!myStack.isEmpty()) {
            return myStack.remove(0); // Removes the first element
        } else {
            return null; // Returns null if the stack is empty
        }
    }

    // Returns the top item without removing it
    public musicData peek() {
        if (!myStack.isEmpty()) {
            return myStack.get(0); // Returns the first element
        } else {
            return null; // Returns null if the stack is empty
        }
    }

    // Adds a new song to the top of the stack
    public void push(musicData newMusic) {
        myStack.add(0, newMusic);
    }

    // Empties the stack by popping all elements
    public void emptyStack() {
        while (!myStack.isEmpty()) {
            pop();
        }
    }

    // Turns the stack into a list of songs as text.
    public String displayStack() {
        StringBuilder displayBuilder = new StringBuilder();
        displayBuilder.append("Songs in your liked songs list: \n");
        for (musicData musicItem : myStack) {
            displayBuilder.append(musicItem);
            displayBuilder.append("\n");
        }
        return displayBuilder.toString();
    }
}
