//package com.LabTask;
//
//public class ArrayEvenOdd {
//
//    public static void main(String[] args) {
//        int[] number = { 10, 15, 20, 25, 30 };
//
//        System.out.println("Even Numbers:");
//        for (int i = 0; i < number.length; i++) {
//            if (number[i] % 2 == 0) {
//                System.out.print(number[i] + " ");
//            }
//        }
//
//        System.out.println("\nOdd Numbers:");
//        for (int i = 0; i < number.length; i++) {
//            if (number[i] % 2 != 0) {
//                System.out.print(number[i] + " ");
//            }
//        }
//    }
//}

package com.LabTask;

public class ArrayEvenOdd {

    public static void main(String[] args) {
        int[] number = { 10, 15, 20, 25, 30 };

        System.out.println("Even and Odd Numbers:");

        for (int i = 0; i < number.length; i++) {
            if (number[i] % 2 == 0) {
                System.out.println(number[i] + " is Even");
            } else {
                System.out.println(number[i] + " is Odd");
            }
        }
    }
}