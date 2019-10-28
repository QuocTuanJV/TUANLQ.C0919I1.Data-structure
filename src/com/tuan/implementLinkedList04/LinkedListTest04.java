package com.tuan.implementLinkedList04;

public class LinkedListTest04 {
    Node04 head;
    public void inserMy(int data){
        Node04 node = new Node04();
        node.data = data;//assign value for new node
        node.next = null;//
        if(head == null){//check if head is null == new node is created
            head = node;
        } else{
            Node04 n = head;// create variable to store head node;
            while(n.next != null){
                n = n.next;//assign current node is next node
            }
            n.next = node;//this is final node;
        }

    }
}
