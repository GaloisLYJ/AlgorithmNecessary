package com.alg.sort;

public class Example {
    public static void sort(Comparable[] a){

    }

    public static boolean less(Comparable v,Comparable w){
        return v.compareTo(w) < 0;
    }

    public static void exch(Comparable[] a,int i,int j){
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    private static void show(Comparable[] a){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static boolean isSorted(Comparable[] a){
        for(int i=1;i<a.length;i++){
            if(less(a[i], a[i-1])) return false;
        }
        return true;
    }

    public static void main(String[] args){
        String[] a = new String[]{"B","A","C","E","D"};
        show(a);
        //Selection.sort(a);
        //Insertion.sort(a);
        //Shell.sort(a);
        //Merge.sort(a);
        //Quick.sort(a);
        //Bubble.sort(a);
        Heap.sort(a);
        show(a);
    }
}
