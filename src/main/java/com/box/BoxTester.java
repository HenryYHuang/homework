package com.box;

import java.util.Scanner;

public class BoxTester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter object's length:");
        float length = scanner.nextFloat();
        System.out.print("Please enter object's width:");
        float width = scanner.nextFloat();
        System.out.print("Please enter object's height:");
        int height = scanner.nextInt();
        if (Box3.getInstance().validate(length, width, height)) {
            System.out.println("Box3");
        } else if (Box5.getInstance().validate(length, width, height)) {
            System.out.println("Box5");
        } else {
            System.out.println("使用XBox360!");
        }
    }
}
