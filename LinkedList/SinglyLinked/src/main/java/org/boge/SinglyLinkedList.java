package org.boge;

public class SinglyLinkedList<T> {
    // https://media.geeksforgeeks.org/wp-content/cdn-uploads/20200922124319/Singly-Linked-List1.png

    private int size = 0;
    private Node<T> head = null;


    private class Node<T> {
        T data;
        Node<T> next;

        public Node(T data, Node<T> next) {
            this.data = data;
            this.next = next;
        }

    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        else{
            return false;
        }
    }

    public void add(T element) {
        if(isEmpty()) {
            head = new Node<T>(element, null);
        } else {
            head = new Node<T>(element, head);
        }
        size++;

    }










}
