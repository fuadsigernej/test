package com.company;

import java.util.Arrays;

public class updatearray {
    public static void main(String[] args) {

       int[] array = {1,2,3};
       int c= 4;

        System.out.println(Arrays.toString(update(array, c)));

    }
    public static int[] update(int[] a, int b) {


        for (int i=0; i< a.length; i++){
          a[i]=a[i]*b;
        }
        return a;


    }
}
