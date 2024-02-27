package com.tn;

import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        //nhập 1 số là số phần tử của mảng lưu tên trường học nhập tiếp đủ số lượng trường học

//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        String[] School = new String[n];
//
//        for (int i = 0; i < School.length; i++) {
//            sc = new Scanner(System.in);
//            System.out.println("Value: " + (i + 1));
//            School[i] = sc.nextLine();
//        }
//        for (int i = 0; i < School.length; i++) {
//            System.out.println("NameSchool: " + (i + 1) + " : " + School[i]);



        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] username = new String[n];
        for (int i = 0; i < username.length; i++) {
            sc = new Scanner(System.in);
            System.out.println("Value: " + (i+1));
            username[i] = sc.nextLine();
        }
        for (int i = 0; i < username.length; i++) {
            System.out.println("Username: " + (i + 1) + " : " + username[i]);
        }
//        biến đếm
        int t = 0;
        for (int i = 0; i < n; i++) {
            if (username[i].equals("t5")) {
                System.out.println("Co ton tai username = t5");
                t++;
                break;
            }
        }
        if (t == 0)
            System.out.println("Khong ton tai username = t5 trong mang username");


//         boolean isExist = false;
//        for (int i = 0 ; i<n;i++) {
//            if(username[i].equals(("t5")) {
//              isExist = true;
//           }
//        }
//        if (isExist == true) {
//        System.out.println(Mang username ton tai t5);
//        }else{
//        System.out.println("Mang username k ton tai t5");
//        }
    }
}
