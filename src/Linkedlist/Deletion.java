package Linkedlist;

import java.util.LinkedList;

public class Deletion {
    public static void main(String[] args) {
        LinkedList<String > ll = new LinkedList<>();
        ll.add("Geeks");
        ll.add("for");
        ll.add("Geeks");
        System.out.println(ll+" ");
        ll.remove(1);
        System.out.println(ll+" ");
    }
}
// There were many methods to use in LL
// removeFirst(); , removeLast();
// addFirst(0); , addLast(4);
// get(int index) , clear();