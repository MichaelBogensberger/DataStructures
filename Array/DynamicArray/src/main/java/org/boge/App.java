package org.boge;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        DynamicArray<String> dArray = new DynamicArray(2);


        dArray.add("text");     //0
        dArray.add("more");     //1
        dArray.add("lorem");    //2        x
        dArray.add("ipsum");    //3        verschieben
        dArray.add("hallo");    //4        verschieben
        dArray.add("welt");     //5        verschieben

        dArray.remove(2);


        for (int i = 0; i < dArray.size(); i++) {
            System.out.println(dArray.get(i));
        }









    }
}
