package array.dynamic_array;

public class DynamicArray<T> {

    // GUIDE:  https://youtu.be/jzJlq35dQII

    // [x][x][x][null][null]
    // size: 3
    // capacity: 5

    // [x][x][x][x][x]
    // size: 5
    // capacity: 5


    private int size;
    private int capacity;
    private T [] array;


    public DynamicArray() {
        this.array = (T[]) new Object[10];
    }

    public DynamicArray(int capacity) {
        this.capacity = capacity;
        this.array = (T[]) new Object[capacity];
    }

    public Object get(int index) {
        return array[index];
    }

    public int size() {
        return size;
    }
    public int capacity() {
        return capacity;
    }

    public void add(T element) {

        if(size >= capacity) {
            grow();
        }
        array[size] = element;
        size++;
    }




    public void delete(int index) {

        for(int i = 0; i < size; i++) {
            System.out.println(i);

            if(i == index) {

                for(int j = 0; j < (size - i - 1); j++){
                    array[i + j] = array[i + j + 1];
                }
                array[size - 1] = null;
                size--;
                if(size <=(int) (capacity/3)) {
                    shrink();
                }
                break;
            }


        }

    }





    public void insert(int index, T element) {

        if(size >= capacity) {
            grow();
        }

        for(int i = size; i > index; i--) {
            array[i] = array[i - 1];
        }
        array[index] = element;
        size++;
    }


    public void delete(T element) {

        for(int i = 0; i < size; i++) {
            if(array[i] == element) {
                for(int j = 0; j < (size - i - 1); j++){
                    array[i + j] = array[i + j + 1];
                }
                array[size - 1] = null;
                size--;
                if(size <=(int) (capacity/3)) {
                    shrink();
                }
                break;
            }
        }
    }

    public int search(T element) {

        for(int i = 0; i < size; i++) {
            if(array[i] == element) {
                return i;
            }
        }
        return -1;
    }

    private void grow() {

        int newCapacity = (int)(capacity * 2);
        T [] newArray = (T[]) new Object[newCapacity];

        for(int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        capacity = newCapacity;
        array = newArray;
    }

    private void shrink() {

        int newCapacity = (int)(capacity / 2);
        T [] newArray = (T[]) new Object[newCapacity];

        for(int i = 0; i < size; i++) {
            newArray[i] = array[i];
        }
        capacity = newCapacity;
        array = newArray;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public String toString() {

        String string = "";

        for(int i = 0; i < capacity; i++) {
            string += array[i] + ", ";
        }
        if(string != "") {
            string = "[" + string.substring(0, string.length() - 2) + "]";
        }
        else {
            string = "[]";
        }
        return string;
    }



}
