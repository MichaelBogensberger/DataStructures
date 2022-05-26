package array.dynamic_array;

public class App {

    public static void main( String[] args )
    {

        DynamicArray<String> dArray = new DynamicArray(2);


        dArray.add("first");    //0
        dArray.add("sec");      //1
        dArray.add("third");    //2        x
        dArray.add("fourth");   //3        verschieben
        dArray.add("fifth");    //4        verschieben
        dArray.add("sixth");    //5        verschieben

        dArray.delete(2);
        dArray.insert(4, "INSERT");

        System.out.println(dArray.toString());

        /*
        for (int i = 0; i < dArray.size(); i++) {
            System.out.println(dArray.get(i));
        }
        */




    }

}
