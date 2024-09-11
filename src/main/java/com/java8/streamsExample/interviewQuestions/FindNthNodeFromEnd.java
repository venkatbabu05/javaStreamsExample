package com.java8.streamsExample.interviewQuestions;

public class FindNthNodeFromEnd {

    Node head = null;

    public class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void addValues(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;

        }
    }


    public static void main(String[] args) {
        FindNthNodeFromEnd obj = new FindNthNodeFromEnd();
        obj.addValues(10);
        obj.addValues(20);
        obj.addValues(30);
        obj.addValues(40);
        obj.addValues(50);
        obj.printNthNodeFromLast(2);
    }

    private void printNthNodeFromLast(int n){
        Node first = head;
        Node second = head;
        for (int i = 0; i < n; i++) {
            first = first.next;
        }
        while (first != null) {
            first = first.next;
            second = second.next;
        }
        System.out.println(second.data);
    }
}
