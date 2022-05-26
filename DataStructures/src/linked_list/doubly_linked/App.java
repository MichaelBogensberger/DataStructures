package linked_list.doubly_linked;

public class App {

    public static void main(String[] args) {
        DoublyLinkedList<String> list = new DoublyLinkedList();

        list.add("first element");
        list.add("sec element");
        list.addFirst("third element");

        System.out.println(list.toString());


    }


}
