package com.bridgelabz;

public class LinkedListMain {
    public static void main(String[] args) {

        //UC1:
        LinkedList<Integer> linkedList1 = new LinkedList<>();
        linkedList1.add(56);
        linkedList1.add(30);
        linkedList1.add(70);
        linkedList1.display();
        //UC2:
        LinkedList<Integer>linkedList2 = new LinkedList<>();
        linkedList2.push(70);
        linkedList2.push(30);
        linkedList2.push(56);
        linkedList2.display();
        //UC3:
        LinkedList<Integer>linkedList3 = new LinkedList<>();
        linkedList3.append(56);
        linkedList3.append(30);
        linkedList3.append(70);
        linkedList3.display();
    }
}