package Tutorial1;

import java.util.Scanner;

public class LinkedList {
    // Define the structure for the linked list node
    static class Node {
        int data;
        Node next;

        // Constructor to create a new node with the given data
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Reference to the head of the list
    Node head;

    // Function to add a new node at the end of the linked list
    public void addNode(int data) {
        // If the list is empty, create a new node and set it as the head
        if (head == null) {
            head = new Node(data);
            return;
        }

        // Otherwise, iterate to the end of the list and add the new node there
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = new Node(data);
    }

    // Function to remove a node with the given data from the linked list
    public void removeNode(int data) {
        // If the list is empty, return immediately
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        // If the head node contains the data to be removed, update the head to the next node
        if (head.data == data) {
            head = head.next;
            return;
        }
    }}