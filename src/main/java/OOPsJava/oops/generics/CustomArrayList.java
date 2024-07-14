package OOPsJava.oops.generics;

import java.util.Arrays;

public class CustomArrayList {
    private int[] data;
    private final int DEFAULT_SIZE = 10;
    private int size = 0;

    public CustomArrayList() {
        this.data = new int[DEFAULT_SIZE];
    }
    public void add(int num) {
        if(isFull()) {
            resize();
        }
        data[size++] = num;
    }

    private void resize() {
        int[] temp = new int[data.length * 2];

        // copy the contents of data into the new array and then change its reference
        for(int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    public int remove() {
        return data[--size];
    }

    public int get (int index) {
        return data[index];
    }

    public int size () {
        return size;
    }

    public void set (int value, int index) {
        data[index] = value;
    }

    private boolean isFull() {
        return size == data.length;
    }

    @Override
    public String toString() {
        return "CustomArrayList{" +
                "data=" + Arrays.toString(data) +
                ", DEFAULT_SIZE=" + DEFAULT_SIZE +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
        CustomArrayList list = new CustomArrayList();
        for(int i = 1; i <= 11; i++) {
            list.add(i);
        }
        System.out.println(list);
        System.out.println(list.size());
    }
}
