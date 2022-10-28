package com.company;

import java.util.Arrays;

public class SumTriangleFromArray {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5};
        printTriangle(arr);
    }
    static void printTriangle(int []arr){
        if(arr.length<1)
            return;

        int temp[]=new int[arr.length-1];
        for (int i = 0; i < arr.length-1; i++) {
            int x=arr[i]+arr[i+1];
            temp[i]=x;
        }

        String ans=Arrays.toString(arr);
        System.out.println(ans);
        printTriangle(temp);
    }
}
