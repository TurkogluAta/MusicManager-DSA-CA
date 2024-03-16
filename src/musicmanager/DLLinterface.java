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
 * Interface for a doubly linked list (DLL) structure specific to managing music
 * playlists.
 */
interface DLLinterface {

    // Adds an element at the specified index in the list.
    public void add(int iIndex, Object element);

    // Removes and returns the element at the specified index from the list.
    public musicData remove(int iIndex);

    // Returns the element at the specified index without removing it.
    public Object get(int iIndex);

    // Returns the number of elements in the list.
    public int size();

    // Checks if the list is empty
    public boolean isEmpty();

    // Prints the list from the beginning to the end.
    public String printList();

    // Prints the list from the end to the beginning.
    public String printListBack();

    // Returns the index
    public int getIndex(String songName);

    // Removes all elements from the list
    public void emptyPlaylist();
}
