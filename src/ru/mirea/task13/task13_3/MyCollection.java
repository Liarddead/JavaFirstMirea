package ru.mirea.task13.task13_3;
import java.lang.reflect.Array;

class MyCollection<T> {
    private final int size;
    private int actual_size = 0;
    private final T[] array;

    public MyCollection(Class<T> c, int size){
        this.size = size;
        array = (T[]) Array.newInstance(c, size);
    }

    public T get(int index){
        return array[index];
    }

    public int size(){
        return actual_size;
    }

    public void add(T item){
        int i = 0;
        while (i < size && array[i] != null){
            ++i;
        }
        if (size == i){
            System.out.println("Not enough space");
            return;
        }
        actual_size = i;

        array[i] = item;
    }

    public void set(int index, T item){
        array[index] = item;
    }

    public void remove(T item){
        int i = 0;
        while (i < size && array[i] != item){
            ++i;
        }

        if (size == i) {
            System.out.println("Item not found");
            return;
        }

        if (size - 1 - i >= 0) System.arraycopy(array, i + 1, array, i, size - 1 - i);

        array[size - 1] = null;
        actual_size--;

    }

    @Override
    public String toString() {
        String out = "[" + array[0];
        for(int i=1; i<actual_size; i++){
            out+=", " + array[i];
        }
        out+="]";
        return out;
    }

    public static void main(String[] args) {
        MyCollection<Student> student_array = new MyCollection<>(Student.class,3);
        System.out.println(student_array.size);
        Student ex1= new Student(12,89);
        Student ex2= new Student(13,79);
        Student ex3= new Student(23,9);
        student_array.set(2,ex1);
        System.out.println(student_array.toString());
        student_array.add(ex2);
        System.out.println(student_array.size());
        ex3 = student_array.get(2);
        System.out.println(ex3.getIdNumber());


    }
}
