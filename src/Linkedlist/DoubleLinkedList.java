package Linkedlist;

public class DoubleLinkedList {
    Node head;
    Node tail;

    DoubleLinkedList(){
        this.head=null;
        this.tail=null;
    }

    class Node{
        int data;
        Node prev;
        Node next;

        Node(int data){
            this.data=data;
            this.prev= prev;
            this.next=next;
        }
    }

    //Traverse a DLL
    public void traverseforward(){
        Node current=head;
        while(current!=null){
            System.out.println(current+" ");
            current=current.next;
        }
    }

    //Traverse backward DLL
    public void traversebackward(){
        Node current = tail;
        while(current!=null){
            System.out.println(current+" ");
            current=current.prev;
        }
    }

    //Insert at beginning
    public void insertatbeggining(int data){
        Node temp = new Node(data);
        if(head==null){
            head= temp;
            tail=temp;
        }
        else{
            temp.next=head;
            head.prev=temp;
            head=temp;
        }
    }


    //insertion at end
    public void inseratend(int data){
        Node temp = new Node(data);
        if(head== null){
            temp=head;
            temp=tail;
        }
        else{
            tail.next=temp;
            temp.prev=tail;
            tail=temp;
        }
    }


    //Deletion in DLL
    public void deletefirstnode(){
        if (head == null) {

            return;
        }
        if(head==tail){
            head=null;
            tail=null;
            return;
        }
        Node temp=head;
        head= head.next;
        head.prev=null;
        temp.next=null;
    }


}
