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
// Represents a node in a doubly linked list
public class DLLnode implements Serializable {

    private Object element; // The data stored in this node
    private DLLnode next; // Reference to the next node in the list
    private DLLnode prev; // Reference to the previous node in the list

    public DLLnode(Object inElement, DLLnode inNext, DLLnode inPrev) {
        element = inElement;
        next = inNext;
        prev = inPrev;
    }

    public Object getElement() {
        return element;
    }

    public void setElement(Object element) {
        this.element = element;
    }

    public DLLnode getNext() {
        return next;
    }

    public void setNext(DLLnode next) {
        this.next = next;
    }

    public DLLnode getPrev() {
        return prev;
    }

    public void setPrev(DLLnode prev) {
        this.prev = prev;
    }

}
