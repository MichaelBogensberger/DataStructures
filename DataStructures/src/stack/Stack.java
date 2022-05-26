package stack;

import java.util.Iterator;
import java.util.LinkedList;

public class Stack<T> {

    private LinkedList<T> list = new LinkedList<>();

    public Stack () {
    }

    public Stack(T firstElement) {
        push(firstElement);
    }


    public int size() {
        return list.size();
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public void push(T element) {
        list.add(element);
    }

    public T pop() {
        if(list.isEmpty()) {
            throw new java.util.EmptyStackException();
        }
        return list.removeLast();
    }

    public T peek () {
        if(list.isEmpty()) {
            throw new java.util.EmptyStackException();
        }
        return list.getLast();
    }


    public Iterator <T> iterator() {
        return list.iterator();
    }











}
