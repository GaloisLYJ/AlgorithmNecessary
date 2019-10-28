package com.alg.sort;

public class Bubble extends Example{
    //冒泡排序
    public static void sort(Comparable[] a){
        if(a==null || a.length<2) return;
        for(int end = a.length-1; end>0; end--){
            for(int i=0;i<end;i++){
                if(less(a[i+1], a[i])){
                    exch(a, i, i+1);
                }
            }
        }
    }
}
