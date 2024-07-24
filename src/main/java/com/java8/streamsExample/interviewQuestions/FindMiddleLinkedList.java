package com.java8.streamsExample.interviewQuestions;

import java.util.ArrayList;
import java.util.List;

public class FindMiddleLinkedList {

    Node head;

    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private void addNode(int i) {
        Node newNode = new Node(i);
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

    private void findMiddleNode() {
        List<Integer> input = new ArrayList<>();
        Node node = head;
        while (node != null) {
            input.add(node.data);
            node = node.next;
        }
        int middle = input.size() / 2;
        System.out.println(input.get(middle));
    }

    public static void main(String[] args) {
        FindMiddleLinkedList obj = new FindMiddleLinkedList();
        obj.addNode(10);
        obj.addNode(20);
        obj.addNode(30);
        obj.addNode(40);
        obj.addNode(50);
        obj.addNode(60);
        obj.findMiddleNode();
    }


}
