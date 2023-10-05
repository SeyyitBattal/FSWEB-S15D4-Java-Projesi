package com.workintech.DecimalToBinary;

import java.util.Stack;

public class DecimalToBinary {

    public static void decimal(int num) {
        if (num == 0) {
            System.out.println("Cevap 0");
        }
        Stack<Integer> stack = new Stack<>();
        int decimalDeger = num;
        while (decimalDeger > 0) {
            int kalan = decimalDeger % 2;
            stack.push(kalan);
            decimalDeger = decimalDeger / 2;
        }

        String binaryNumber = "";
        while (!stack.isEmpty()) {
            binaryNumber += stack.pop();
        }

        System.out.println(num + " için: decimal değeri: " + binaryNumber);
    }

    public static void main(String[] args) {
        decimal(5);
        decimal(6);
        decimal(13);
    }
}
