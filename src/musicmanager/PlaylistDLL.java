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
public class PlaylistDLL implements DLLinterface, Serializable {

    private DLLnode head;
    private DLLnode last;
    private DLLnode currNode;
    private int iSize;

    PlaylistDLL() {
        head = null;
        last = null;
        iSize = 0;
        currNode = head;
    }

    public boolean isEmpty() {
        return (iSize == 0);
    }

    public int size() {
        return iSize;
    }

    public void add(int inIndex, Object inElement) {
        DLLnode newNode = new DLLnode(inElement, null, null);
        if (iSize == 0) {
            head = newNode;
            last = newNode;
        } else {
            if (inIndex == 1) {
                head.setPrev(newNode);
                newNode.setNext(head);
                head = newNode;

            } else if (inIndex == (iSize + 1)) {
                last.setNext(newNode);
                newNode.setPrev(last);
                last = newNode;

            } else {
                setCurrent(inIndex);

                DLLnode prev = currNode.getPrev();

                prev.setNext(newNode);
                newNode.setPrev(prev);
                newNode.setNext(currNode);
                currNode.setPrev(newNode);
            }
        }
        iSize++;
    }

    public musicData remove(int iIndex) {
        musicData removedData = null;
        if (iSize > 0) {
            if (iIndex == 1) {
                removedData = (musicData) head.getElement();
                head = head.getNext();
                if (head != null) {
                    head.setPrev(null);
                } else {
                    last = null;
                }
            } else if (iIndex == iSize) {
                removedData = (musicData) last.getElement();
                last = last.getPrev();
                last.setNext(null);
            } else {
                setCurrent(iIndex);
                removedData = (musicData) currNode.getElement();

                DLLnode prev = currNode.getPrev();
                DLLnode next = currNode.getNext();

                prev.setNext(next);
                next.setPrev(prev);
            }
            currNode = null;
            iSize--;
        } else {
            System.out.println("The list is empty");
        }
        return removedData;
    }

    private void setCurrent(int inIndex) {
        currNode = head;
        for (int iCount = 1; iCount < inIndex; iCount++) {
            currNode = currNode.getNext();
        }
    }

    public Object get(int iIndex) {
        setCurrent(iIndex);
        return currNode;
    }

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
        return -1;
    }

    public void emptyPlaylist() {
        head = null;
        last = null;
        iSize = 0;
    }
}
