package com.alg.sort;

public class Heap extends Example{
    //堆排序 O(NlogN)
    public static void sort(Comparable[] a){
        if(a == null || a.length<2) return;
        for(int i=0;i<a.length;i++){
            heapInsert(a, i);
        }
        int heapSize = a.length;
        exch(a, 0, --heapSize);
        while (heapSize>0){
            heapify(a, 0, heapSize);
            exch(a, 0, --heapSize);
        }
    }

    public static void heapInsert(Comparable[] a, int index){
        while (less(a[(index-1)/2],a[index])){
            exch(a, index, (index-1)/2);
            index = (index-1)/2;
        }
    }

    public static void heapify(Comparable[] a, int index, int heapSize){
        int left = index*2 + 1;
        while (left < heapSize){
            int largest = left+1 < heapSize && less(a[left],a[left+1])?left+1 : left;
            largest = less(a[index],a[largest])? largest : index;
            if(largest == index){
                break;
            }
            exch(a, largest, index);
            index = largest;
            left = index*2 + 1;
        }
    }

}
