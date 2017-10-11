package com.testpackage;

public class Main {

    public static void main(String[] args) {
        int x = (int) (Math.random() * 21 - 10);

        System.out.println(x);

        if (x > 0) {
            if (x % 2 == 0) {
                System.out.println("Число четное!");
            }
            System.out.println("Число положительное!");
        } else {
            System.out.println("Число отрицательное!");
        }
    }
}

