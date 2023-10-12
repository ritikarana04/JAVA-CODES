import java.util.*;

public class LinkedList {

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node head;
    public Node tail;
    public static int size;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;

        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;

        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void print() {
        if (head == null) {
            System.out.println("LL is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void add(int idx, int data) {

        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;
        while (i < idx - 1) {
            temp = head;
            i++;

        }
        // i =idx-1; temp->prev
        newNode.next = temp.next;
        temp.next = newNode;

    }

    public int removeFirst() {
        if (size == 0) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;

        }
        int val = head.data;
        head = head.next;
        size--;

        return val;

    }

    public int removeLast() {
        if (size == 0) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;

        }
        Node prev=head;
        for(int i=0;i<size-2;i++){
            prev=prev.next;

        }
        int val = prev.next.data;
        prev.next=null;
        tail=prev;

        
        size--;

        return val;

    }
    public int itrSearch(int key){
        Node temp=head;
        int i=0;
        while(temp!=null){
            if(emp.data==key){//key found
return i;

            }
        temp=temp.next;
        i++;

        }
        //key not found 
        return -1;

    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        ll.addFirst(2);

        ll.addFirst(1);

        ll.addLast(4);

        ll.addLast(5);

        ll.add(2, 3);

        ll.print();
        // System.out.println(ll.size);
        ll.removeFirst();
        ll.print();
        System.out.println(ll.size(3));
      System.out.println(ll.size(10));
    }

}





















