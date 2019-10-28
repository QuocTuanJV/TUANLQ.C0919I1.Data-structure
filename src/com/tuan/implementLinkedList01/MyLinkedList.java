package com.tuan.implementLinkedList01;

public class MyLinkedList<E> {
    private Node<E> head = null;
    private Node<E> tail = null;
    public MyLinkedList(){

    }
    public void addFirst(E e){
        Node<E> newNode = new Node<>(e);
        newNode.next = head;
        head = newNode;

    }

}
