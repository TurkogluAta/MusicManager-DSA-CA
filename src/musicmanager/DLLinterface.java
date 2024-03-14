/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package musicmanager;

/**
 *
 * @author Ata Turkoglu
 */
interface DLLinterface {
    public void add(int iIndex, Object element);
    public boolean remove(int iIndex);
    public Object get(int iIndex);
    public int size();
    public boolean isEmpty();
    public String printList();
    public boolean contains(Object element);
}
