/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package musicmanager;

import java.io.Serializable;

/**
 *
 * @author Ata Turkoglu
 */
/**
 * A class that implements a doubly linked list to manage a playlist.
 */
public class PlaylistDLL implements DLLinterface, Serializable {

    private DLLnode head; // Start of the playlist
    private DLLnode last; // End of the playlist
    private DLLnode currNode; // Current node for tracking
    private int iSize; // Number of songs in the playlist

    // Constructor initializes the playlist as empty
    PlaylistDLL() {
        head = null;
        last = null;
        iSize = 0;
        currNode = head;
    }

    // Checks if the playlist is empty
    public boolean isEmpty() {
        return (iSize == 0);
    }

    // Returns the number of songs in the playlist
    public int size() {
        return iSize;
    }

    // Adds a new song at a specified position
    public void add(int inIndex, Object inElement) {
        DLLnode newNode = new DLLnode(inElement, null, null);
        // Adding logic based on index and list size

        // List is empty
        if (iSize == 0) {
            head = newNode;
            last = newNode;
        } else { // List is not empty

            if (inIndex == 1) { // Insert at the beginning
                head.setPrev(newNode);
                newNode.setNext(head);
                head = newNode;

            } else if (inIndex == (iSize + 1)) { // Insert at the end 
                last.setNext(newNode);
                newNode.setPrev(last);
                last = newNode;

            } else { // Insert in the middle
                setCurrent(inIndex);

                DLLnode prev = currNode.getPrev();

                prev.setNext(newNode);
                newNode.setPrev(prev);
                newNode.setNext(currNode);
                currNode.setPrev(newNode);
            }
        }
        iSize++; // Increment the size of the list after insertion
    }

    // Removes and returns the element at the specified position.
    public musicData remove(int iIndex) {
        musicData removedData = null;
        if (iSize > 0) { // Ensure the list isn't empty

            if (iIndex == 1) { // Remove from the beginning
                removedData = (musicData) head.getElement();
                head = head.getNext();
                if (head != null) {
                    head.setPrev(null);
                } else {
                    last = null;
                }

            } else if (iIndex == iSize) { // Remove from the end
                removedData = (musicData) last.getElement();
                last = last.getPrev();
                last.setNext(null);

            } else { // Remove from the middle
                setCurrent(iIndex);
                removedData = (musicData) currNode.getElement();

                DLLnode prev = currNode.getPrev();
                DLLnode next = currNode.getNext();

                prev.setNext(next);
                next.setPrev(prev);

            }
            currNode = null;
            iSize--; // Decrement size after removal

        } else {
            System.out.println("The list is empty");
        }
        return removedData;
    }

    // Sets the currNode to the node at the specified index
    private void setCurrent(int inIndex) {
        currNode = head;
        for (int iCount = 1; iCount < inIndex; iCount++) {
            currNode = currNode.getNext();
        }
    }

    // Retrieves the element at the specified position
    public Object get(int iIndex) {
        setCurrent(iIndex);
        return currNode;
    }

    // Turns the playlist into a list of songs as text.
    public String printList() {
        StringBuilder playlist = new StringBuilder();
        playlist.append("Songs in your playlist: \n");
        int index = 1;
        for (DLLnode aNode = head; aNode != null; aNode = aNode.getNext(), index++) {
            String oneSong;
            if (aNode.getElement() != null) {
                oneSong = aNode.getElement().toString();
            } else {
                oneSong = "Unknown Song";
            }
            playlist.append(index).append(". ").append(oneSong).append("\n");
        }
        return playlist.toString();
    }

    public String printListBack() {
        StringBuilder allItems = new StringBuilder();
        allItems.append("Songs in your playlist: \n");
        int index = size();
        for (DLLnode aNode = last; aNode != null; aNode = aNode.getPrev(), index--) {
            String oneItem = aNode.getElement().toString();
            allItems.append(index).append(". ").append(oneItem).append("\n");
        }
        return allItems.toString();
    }

    // Searches for an element by its song name and returns its position in the list
    public int getIndex(String songName) {
        DLLnode currNode = head;
        int index = 1;
        while (currNode != null) {
            musicData data = (musicData) currNode.getElement();
            if (data != null && data.getSongName() != null && data.getSongName().equalsIgnoreCase(songName)) {
                return index;
            }
            currNode = currNode.getNext();
            index++;
        }
        return -1; // Song not found
    }

    // Clears the playlist, removing all elements
    public void emptyPlaylist() {
        head = null;
        last = null;
        iSize = 0;
    }
}
