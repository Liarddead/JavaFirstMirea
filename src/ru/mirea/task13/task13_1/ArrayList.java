package ru.mirea.task13.task13_1;
import java.util.Collection;
 import java.util.List;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayList implements List {
    Object [] array;
    int count;
    int size;
    int iterationmarker;
public ArrayList(){
    Object [] array=new Object [1000];
    size=1000;
    count=0;
    iterationmarker=0;
}
    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        if(count==0){
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {

        return new Object[0];
    }

    @Override
    public boolean add(Object o) {
    if (count==size-1) {
        return false;
    }
    else {
        count++;
        array[iterationmarker] = o;
        return true;
    }

    }

    @Override
    public boolean remove(Object o) {
    for(int i=0;i<size;){
        if(array[i]==o){
            for (int k=i+1;k<size;k++){
                array[k-1]=array[k];
            }
            size--;
            return true;
        }
    }
        return false;
    }

    @Override
    public boolean addAll(Collection c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection c) {
        return false;
    }

    @Override
    public void clear() {
    for(int i=0;i<size;i++){
        array[i]=null;
        count=0;
    }

    }

    @Override
    public Object get(int index) {
    Object o = new Object();
    if(array[index]!=o){
        return null;
    }
        if ((index>size)){
            return null;
        }
        return array[index-1];
    }

    @Override
    public Object set(int index, Object element) {
    if (index>size){
        return null;
    }
    array[index-1]=element;
    return this;
    }

    @Override
    public void add(int index, Object element) {
    if(index>size){
       Object[] New_array= new Object[index-1];
       for(int i=0;i<size;i++){
           New_array[i]=array[i];
       }
       array=New_array;
       size=index;
       count++;
       array[index]=element;

    }
    else{
        Object[] New_array= new Object[size+1];
        for(int i=0;i<index-1;i++){
            New_array[i]=array[i];
        }
        New_array[index]=element;
        for(int k=index;k<size;k++){
            New_array[k+1]=array[k];
        }
        array=New_array;
        count++;
        size++;
    }

    }

    @Override
    public Object remove(int index) {
        if (index > size) {
            return null;
        } else {
            Object Removable=array[index-1];
            for (int k = index ; k < size; k++) {
                array[k - 1] = array[k];
            }
            size--;
            count--;
            return Removable;
        }
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator listIterator() {
        return null;
    }

    @Override
    public ListIterator listIterator(int index) {
        return null;
    }

    @Override
    public List subList(int fromIndex, int toIndex) {
        return null;
    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }

    public static void main(String[] args) {
        ArrayList list= new ArrayList();
        Student ex1= new Student(11,4);
        Student ex2= new Student(23,7);
        System.out.println(list.isEmpty());
        System.out.println(list.size());
        System.out.println(list.get(23));
        list.set(23,ex1);
        Student ex3=(Student)list.get(23);
        System.out.println(ex3.getIdNumber());
        list.add(54,ex2);
        System.out.println(list.size());
        list.remove(ex1);
        System.out.println(list.remove(ex1));
        list.clear();
        System.out.println(list.isEmpty());
    }
}
