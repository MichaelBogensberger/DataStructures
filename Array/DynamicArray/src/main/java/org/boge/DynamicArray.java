package org.boge;

public class DynamicArray<T> {

     private T [] array;
     private int counter = 0;
     private int leng;



    public DynamicArray() {
        this.leng = 1;
        array = (T[]) new Object[leng];
    }


    public DynamicArray(int leng) {
        if (leng < 0) {
            throw new IllegalArgumentException("Länge " + leng + " nicht erlaubt");
        }

        this.leng = leng;
        array = (T[]) new Object[leng];
    }

    public T get(int index) {
        return array[index];
    }

    public int size() {
        return leng;
    }


    public void add (T element) {

        if(leng == counter) {

            leng = leng+1;
            // neues Objekt mit einer um 1 größeren Menge
            T [] nArray = (T[]) new Object[leng];
            for (int i = 0; i < array.length; i++) {
                nArray[i] = array[i];
            }
            array = nArray;
        }


        array[counter] = element;
        counter++;

    }


    public void remove(int index) {
        // muss bei index finden und alels was rechts davon ist um eins nach links verschieben
        // und array um eins kleiner machen
        for (int i = index+1; i < leng; i++) {
            array[i-1] = array[i];
            //System.out.println(i);
        }

        leng = leng -1;
        // neues Objekt mit einer 1 kleineren Menge
        T [] nArray = (T[]) new Object[leng];
        for (int i = 0; i < nArray.length; i++) {
            nArray[i] = array[i];
        }
        array = nArray;





    }








}
