package com.tn;

public class Program {
    public static void main(String[] args) {
//        data_type[] variable;
//        int[] arrNum = new int[number];
//        System.out.println("Length: " + int.length);
//        int[] arrNum = new int[5];
//        System.out.println("Length: " + arrNum.length);
//        // 0 1 2 3 4
////      --------------
//        // 0 0 0 0 0
//
//        System.out.println("Element 1: " + arrNum[0]);
//        System.out.println("Element 2: " + arrNum[1]);
//        System.out.println("Element 3: " + arrNum[2]);
//        System.out.println("Element 4: " + arrNum[3]);
//        System.out.println("Element 5: " + arrNum[4]);
//
//        arrNum[2] = 18;
//        arrNum[4] = 35;
//
//        for (int i = 0; i < arrNum.length; i++) {
//            System.out.println("Value: " + arrNum[i]);
//        }

        //khai báo 1 mảng chuỗi có 3 phần tử lưu họ tên rồi in ra


        String[] arrFullname = new String[3];

        arrFullname[0] = "Nguyen Van A";
        arrFullname[1] = "Nguyen Van B";
        arrFullname[2] = "Nguyen Van C";

        for (int i = 0; i < arrFullname.length; i++) {
            System.out.println("Ho va ten: " + arrFullname[i]);
        }


    }
}
