package com.zipcodewilmington.singlylinkedlist;

import java.util.LinkedList;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedList {
    Node head;

    public SinglyLinkedList(Node head) {
        this.head = head;
    }

    public void add(int data) {
        Node n = new Node(data);
        if (head == null) {
            head = n;
        } else {
            Node curr = head;
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = n;
        }
    }

    public Node getNode(int index) {
        Integer nodeIndex = 0;
        Node curr = head;
        while (curr != null) {
            if (nodeIndex == index) {
                return curr;
            }
            nodeIndex++;
            curr = curr.next;
        }
        return null;
    }

    public Node removeNode(int index) {
        Node curr = head;
        Node delete = null;
        Integer currentIndex = 0;
        while (curr != null) {
            if (currentIndex + 1 == index) {
                delete = curr.next;
                curr.next = delete.next;
                break;
            }
            currentIndex++;
            curr = curr.next;
        }
        return delete;
    }

    public Boolean contains(int data) {
        Boolean containNode = false;
        Node curr = head;
        while (curr != null) {
            if (curr.data == data) {
                containNode = true;
                break;
            }
            curr = curr.next;
        }
        return containNode;
    }

    public Integer findIndex(int data) {
        Integer findNodeIndex = 0;
        Node curr = head;
        while (curr != null) {
            if (curr.data == data) {
                break;
            }
            findNodeIndex++;
            curr = curr.next;
        }
        return findNodeIndex;
    }

    public Integer getSize() {
        Integer nodeSize = 0;
        Node curr = head;

        while (curr != null) {
            nodeSize++;
            curr = curr.next;
        }
        return nodeSize;
    }



}