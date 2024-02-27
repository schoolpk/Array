package com.tn;

import java.util.Arrays;
import java.util.Scanner;

public class BTVN {
    public static void main(String[] args) {
//        1. Xuất các giá trị của mảng ra



        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            sc = new Scanner(System.in);
            System.out.println("Value: " + ( i + 1 ));
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Arr: " + (i+1) + " : " + arr[i]);
        }

//        2. Tìm min, max
        int min = arr[0];
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min){
                min =arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);

//        3. Tìm các số nguyên tố có trong mảng
        int[] T = new int[n];
        int t = 0;
        for (int i = 0; i < n; i++) {
            int temp = 0;
            for (int j = 2; j < arr[i]; j++) {
                if (arr[i] % j == 0) {
                    temp++;
                }
            }
            if (temp == 0) {
                T[t] = arr[i];
                t++;
            }
        }
        System.out.println("Cac so nguyen to la:");
        for (int i = 0; i < t; i++) {
            System.out.print(" " + T[i]);
        }
//        4. Sắp xếp mảng theo thứ tự tăng dần
        System.out.print("Sap xep mang theo thu tu tang dan:");
        for (int i = 0; i < (n-1); i++) {
            for (int j = 0; j < (n-i-1); j++) {
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(" " + arr[i]);
        }
    }
}

