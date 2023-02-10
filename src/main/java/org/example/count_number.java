package org.example;

import java.util.Scanner;

public class count_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value: ");
        int value = sc.nextInt();

        int[] arr_notes = {1000,500,200,100,50,20,10,5,2,1};
        for (int arr_note : arr_notes){
            if(value >=arr_note){
                int add = value/arr_note;
                System.out.println(arr_note + " "+ add);
                value = value % arr_note;
            }
        }

    }
}
