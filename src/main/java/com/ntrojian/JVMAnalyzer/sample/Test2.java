package com.ntrojian.JVMAnalyzer.sample;

/**
 * Created by Nate on 2/23/16.
 */
public class Test2 {
    public int sum(int[] arr) {
        int temp = 0;
        for(int i=0; i<arr.length; i++) {
            temp += arr[i];
        }
        return temp;
    }

    public int num1(int[][] arr) {
        int temp = 0;
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                if(arr[i][j]==1)
                    temp++;
            }
        }
        return temp;
    }

    public int fib(int n) {
        if(n==0 || n==1)
            return 1;
        return fib(n-1) + fib(n-2);
    }
}
