package com.ntrojian.JVMAnalyzer.sample;

/**
 * Created by Nate on 2/23/16.
 */
public class Test1 {
    public void testMethod1(int[] arr) {
        for(int i=0; i<arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public void testMethod2(int[] arr) {
        int temp = arr.length;
        for(int i=0; i<temp; i++) {
            System.out.println(arr[i]);
        }
    }

    public void testMethod3(int[] arr) {
        int i=0;
        while(true) {
            if(i==arr.length)
                break;
            System.out.println(arr[i]);
            i++;
        }
    }
}
