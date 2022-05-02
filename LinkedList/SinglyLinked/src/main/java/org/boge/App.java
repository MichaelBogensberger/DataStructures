package org.boge;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        SinglyLinkedList<String> list = new SinglyLinkedList<>();
        list.add("D");
        list.add("C");
        list.add("B");
        list.add("A");



        list.add(1,"NEW");

        list.printAll();

        System.out.println( "Size: " +list.size()  );

    }
}
