package OOPsJava.oops.generics;

import java.util.Arrays;

public class CustomGenericArrayList<T extends Number> {
    private Object[] data;
    private static final int DEFAULT_SIZE = 10;
    private int size = 0;

    public CustomGenericArrayList() {
        data = new Object[DEFAULT_SIZE];
    }
    public void add(int num) {
        if(isFull()) {
            resize();
        }
        data[size++] = num;
    }

    private void resize() {
        Object[] temp = new Object[data.length * 2];

        // copy the contents of data into the new array and then change its reference
        for(int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    public T remove() {
        return (T)(data[--size]);
    }

    public T get (int index) {
        return (T)data[index];
    }

    public int size () {
        return size;
    }

    public void set (T value, int index) {
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
        CustomGenericArrayList<Integer> list = new CustomGenericArrayList<>();
        for(int i = 1; i <= 11; i++) {
            list.add(i);
        }
//        list.add("reg");
        System.out.println(list);
        System.out.println(list.size());
    }
}
