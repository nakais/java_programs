package org.example;

import java.util.Scanner;

public class sum_of_digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int number = sc.nextInt();
        int sum = 0;

        while (number > 0){
            sum += number % 10;
            number /= 10;
        }
        System.out.println(sum);

    }
}
