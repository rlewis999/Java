package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        final double RATE = .75; // constant

        double totAmount = 23.7;
        int num = 5;
        double num2;
        num = (int)totAmount;  // explicit casting
        totAmount = num;       //implicit
        int a = 25;
        num2 = a + 3.0 / 4 - 12 * (9 - 6); // answer is :
        // 3.0 / 4.0 = 0.75
        // 25 + 4.0 = .75
        // 12 * 3 = 36
        // 25 + 0 = -11.0
        // 25 + 36 = -10.25
        System.out.println(num2);
    }
}
