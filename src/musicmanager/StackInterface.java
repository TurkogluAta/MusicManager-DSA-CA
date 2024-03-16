/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package musicmanager;

/**
 *
 * @author Ata Turkoglu
 */
/**
 * Defines the operations for a stack data structure that handles music data.
 */
interface StackInterface {

    // Adds a new music item to the top of the stack
    public void push(musicData newMusic);

    // Removes and returns the music item at the top of the stack
    public musicData pop();

    // Looks at the music item at the top of the stack without removing it
    public musicData peek();

    // Returns the number of music items in the stack
    public int size();

    // Checks if the stack is empty
    public boolean isEmpty();

    // Checks if the stack is full (Always false)
    public boolean isFull();

    // Removes all music items from the stack
    public void emptyStack();

    // Displays all music items in the stack as a String
    public String displayStack();
}
