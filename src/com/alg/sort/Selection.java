package com.alg.sort;

public class Selection extends Example{
    //选择排序 O(N^2)
    public static void sort(Comparable[] a){
        int N = a.length;
        for(int i=0;i<N;i++){
            int min = i;
            for(int j = i + 1;j<N;j++){
                if(less(a[j], a[min])) min = j;
            }
            exch(a, i, min);
        }
    }

}
