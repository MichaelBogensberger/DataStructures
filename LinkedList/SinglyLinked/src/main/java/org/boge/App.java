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

        list.append("A");
        list.append("B");
        list.append("C");
        list.append("D");

        list.printAll();



        //list.append("appended");
        //list.add(3,"NEW");

        list.delete(3);

        list.printAll();

        System.out.println( "Size: " +list.size()  );

    }
}
