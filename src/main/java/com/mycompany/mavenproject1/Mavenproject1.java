package com.mycompany.mavenproject1;

import java.util.Arrays;

public class Mavenproject1 {

    private static int[] t;

    public static void mysort(int[] arr) {
        //sorting logic  
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int tmp = 0;
                if (arr[i] > arr[j]) {
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
    }

    public static int removeDuplicates(int[] b, int n) {
        // if(array size if 0 or 1 array is already sorted)
        if (n == 0 || n == 1) {
            return n;
        }
        //create another array unique elem
        int[] temp = new int[n];
        int j = 0;

        // check if the ith element is not equal to 
        // the (i+1)th element, then add that element
        // at the jth index in the same array
        // which indicates that te particular element 
        // will only be added once in the array
        for (int i = 0; i < n - 1; i++) {
            if (b[i] != b[i + 1]) {
                temp[j++] = b[i];
            }
        }
        temp[j++] = b[n - 1];
        t = new int[j];
        t = Arrays.copyOf(temp, j);
        System.out.println("removeDuplicate");
        for (int num : t) {
            System.out.print(num + " ");
        }
        return j;
    }

    public static void main(String[] args) {
        int[] a = {5, 2, 4, 3, 1, 5, 3, 2};
        int[][] arr = {{2, 1}, {7, 5}};

        System.out.println("Unsorted array = " + Arrays.toString(a));
        Arrays.sort(a);
        mysort(a);
        int n = a.length;
        // the function will modify the array a[]
        // such that the starting j elements 
        // will be having all unique elements 
        // and no element will be appearing more than
        // once
        int result = removeDuplicates(a, n);
        System.out.println("\nMain");
        for (int num : t) {
            System.out.print(num + " ");
        }
        int siz = arr.length;
        int[][] mytranspose = new int[siz][siz];
        int[] col;
        int[] row;
        for (int i = 0; i < siz; i++) {
            col = arr[i];
            //Arrays.sort(col);
            System.out.println("Col Array=" + Arrays.toString(col));
            for (int j = 0; j < siz; j++) {
                mytranspose[i][j] = arr[j][i];
            }
            row = mytranspose[i];
            //Arrays.sort(row);
            System.out.println("Row Array=" + Arrays.toString(row));
            if (Arrays.equals(col, row)) {
                System.out.println("Soduku puzzle at col index= " + i + " True");
            } else {
                System.out.println("Soduku puzzle at col index= " + i + " False");
            }
        }       
    }

}
