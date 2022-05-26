package stack;

import java.util.Iterator;

public class App {

    public static void main(String[] args) {

        Stack<String> stack = new Stack<>("A");

        stack.push("B");
        stack.push("C");

        System.out.println("Lösche: " + stack.pop());
        System.out.println("Neue size: " + stack.size());

        System.out.println("peek: " + stack.peek());
        System.out.println("size: " + stack.size());

        Iterator<String> iterator = stack.iterator();


        while (iterator.hasNext()) {
            String i = iterator.next();
            System.out.println(i);
        }




    }

}
