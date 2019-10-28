package com.tuan.implementLinkedList03;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListTest {
    public static void main(String[] args) {

//        LinkedList list = new LinkedList();
//        list.add(5);
//        list.add(1,12);
//        System.out.println("First: " + list.getFirst());
//        System.out.println("Last : " + list.getLast());
//        ArrayList<Integer> arrayList = new ArrayList<>();
//        arrayList.clone();
        MyLinkedList myList = new MyLinkedList();
        myList.insertMy(5);
        myList.insertMy(6);
        myList.insertMy(7);
        myList.insertMy(8);
        myList.showMy();
    }
}
