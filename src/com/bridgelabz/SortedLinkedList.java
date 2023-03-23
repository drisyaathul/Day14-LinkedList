package com.bridgelabz;

public class SortedLinkedList <T extends Comparable<T>>extends LinkedList{

    public void sort() {
        Node<T> temp1 = head;
        Node<T> temp2 = head;
        T temp3;

        if (head != null) {
            while (temp1 != null) {
                temp2 = temp1.next;
                while (temp2 != null) {
                    if ((temp1.data.compareTo(temp2.data)) > 0) {
                        temp3 = temp1.data;
                        temp1.data = temp2.data;
                        temp2.data = temp3;
                    }
                    temp2 = temp2.next;
                }
                temp1 = temp1.next;
            }
        }
    }
}



