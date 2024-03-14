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
    
    public boolean remove(int iIndex) {
        if (iSize > 0) {
            if(iIndex == 1) {
                head = head.getNext();
                head.setPrev(null);
                
            } else if(iIndex == iSize) {
                last = last.getPrev();
                last.setNext(null);
                
            } else {
                setCurrent(iIndex);
                
                DLLnode prev = currNode.getPrev();
                DLLnode next = currNode.getNext();
                
                prev.setNext(next);
                next.setPrev(prev);
            }
            currNode = null;
            
            iSize--;
            return true;
        } else {
            return false;
        }
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
        String playlist = new String();
        for (DLLnode aNode = head; aNode != null; aNode = aNode.getNext()) {
            String oneSong = (aNode.getElement()).toString();
            playlist = playlist + oneSong + ", ";
        }
        return playlist;
    }
    
    // public String printListBwd
    
    public boolean contains(Object element) {
        currNode = head;
        while (currNode != null) {
            if (currNode.getElement().equals(element)) {
                return true;
            }
            currNode = currNode.getNext();
        }
        return false;
    }

 
}
