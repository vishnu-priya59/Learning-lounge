package Linkedlist;

import java.util.ArrayList;

public class LinkedList {

    private Node head;
    private Node tail;
    private int size;
    public LinkedList(){
        this.size=0;
    }

    private class Node{
        private int value;
        private Node next;

        public Node(int value){
            this.value=value;
        }
        public Node(int value, Node next){
            this.value= value;
            this.next= next;
        }
    }

    //INSERTION AT FIRST
    public void insertfirst(int val){
        Node node = new Node(val);
        node.next=head;
        head=node;

        if(tail==null){
            tail=head;
        }
        size+=1;

    }

    /*
        @Ja
     */
    public void insertlast(int val){
        new ArrayList<>();
        if(tail==null){
            insertfirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next=node;
        tail=node;
        size++;
    }

    //DISPLAY A LINKEDLIST
    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.value+" -> ");
            temp=temp.next;
        }
       System.out.println("END");
    }

    //INSERTION IN THE MIDDLE
    public void insertMiddle(int val, int index){
        if(index==0){
            insertfirst(val);
            return;
        }
        if(index==size){
            insertlast(val);
            return;
        }
        Node temp = head;
       // Node newNode = new Node();
        for(int i=1;i<index;i++){
            temp=temp.next;
        }
        Node node = new Node(val,temp.next);
        temp.next=node;
        size++;

    }


    public class Main{
        public static void main(String[] args) {
            LinkedList list=new LinkedList();
            list.insertfirst(8);
            list.insertfirst(12);
            list.insertfirst(17);
            list.insertfirst(6);
            list.insertlast(99);
            list.display();

        }
    }

}
