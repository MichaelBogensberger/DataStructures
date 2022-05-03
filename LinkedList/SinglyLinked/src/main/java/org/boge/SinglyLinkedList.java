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

    public void append(T element) {

        if(isEmpty()) {
            head = new Node<T>(element, null);
            size++;
        } else {

            Node temp = head;
            for (int i = size-1; i >= 0; i--) {
                if (i == 0) {
                    Node newNode = new Node(element, null);
                    temp.next = newNode;
                    size++;
                }

                temp = temp.next;
            }

        }

    }

    public void delete(int index) {
        if(isEmpty()) {
            throw new IllegalArgumentException("Die Liste ist leer");
        } else {

            if (index == size-1) {
                head = head.next;
                size--;
            } else {

                Node temp = head;
                for (int i = size-1; i >= index+1; i--) {
                    //System.out.println(i);
                    if(i == index+1) {
                        //System.out.println("here at: " + i);
                        //System.out.println(temp.data);
                        //System.out.println(temp.next.data);

                        if(temp.next.next == null) {
                            temp.next = null;
                        } else {
                            temp.next = temp.next.next;
                        }

                        size--;

                    }

                    temp = temp.next;
                }

            }

        }


        }


    public void add (int index, T element) {

        if(isEmpty()) {
            head = new Node<T>(element, null);
            size++;
        } else {



            Node temp = head;

            for (int i = size-1; i >= index; i--) {

                if(i == index) {
                    //System.out.println("here at: " + i);
                    Node newNode = new Node(element, temp.next);
                    temp.next = newNode;
                    size++;
                }



                temp = temp.next;
            }



        }

    }



    public void printAll() {

        Node temp = head;

        System.out.println("{");
        for (int i = size-1; i >= 0; i--) {
            System.out.println("\t index: " + i + ", data: " + temp.data);
            temp = temp.next;
        }
        System.out.println("}");

    }










}
