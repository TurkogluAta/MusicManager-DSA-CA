/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package musicmanager;

/**
 *
 * @author Ata Turkoglu
 */
interface StackInterface {
    public void push(Object newMusic);    
    public Object pop();    
    public Object peek();    
    public int size();    
    public boolean isEmpty();    
    public boolean isFull();    
    public void emptyStack();   
    public String displayStack();
}
