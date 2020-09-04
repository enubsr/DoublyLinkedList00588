/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usedoublylinkedlist00588;

/**
 *
 * @author Enubs
 * @param <E>
 */
public class DList<E> {
    private DNode<E> header, trailer;
    private int size;
    
    public DList(){
        trailer = new DNode<>(null, null, null);
        header = new DNode<>(null, null, trailer);
        trailer.setPrev(header);
    }
    
    public void addFirst(E element){
        addBetween(header, element, header.getNext());
    }
    
    public void addLast(E element){
        addBetween(trailer.getPrev(), element, trailer);
    }
    
    private void addBetween(DNode<E> prev, E element, DNode<E> next){
        DNode<E> newNode = new DNode<>(prev, element, next);
        prev.setNext(newNode);
        next.setPrev(newNode);
        size++;
    }
    
    private E remove(DNode<E> node){
        E temp = node.getElement();
        node.getPrev().setNext(node.getNext());
        node.getNext().setPrev(node.getPrev());
        size--;
        node.setNext(null);
        node.setPrev(null);
        return temp;
    }
    
    public E removeFirst(){
        return remove(header.getNext());
    }
    
    public E removeLast(){
        return remove(trailer.getPrev());
    }
    
    public int size(){
        return size;
    }
    
    public boolean isEmpty(){
        return size == 0;
    }
    
    public E first(){
        return header.getNext().getElement();
    }
    
    public E last(){
        return trailer.getPrev().getElement();
    }
}
