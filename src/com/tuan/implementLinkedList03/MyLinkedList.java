package com.tuan.implementLinkedList03;

public class MyLinkedList {
    Node head;
    public void insertMy(int data){
        Node node = new Node();
        node.data = data;
        node.next = null;//chi toi node tiep theo
        if(head == null){//node hien tai
            head = node;
        } else {
            Node n = head;
            while(n.next !=null){
                n = n.next;
            }
            n.next = node;
        }
    }

    public void showMy(){
        Node node = head;
        while(node.next !=null){
            System.out.println(node.data);
            node = node.next;
        }
        System.out.println(node.data);
    }

}
