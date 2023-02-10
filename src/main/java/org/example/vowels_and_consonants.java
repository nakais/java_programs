package org.example;

import java.util.Scanner;

public class vowels_and_consonants {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter a word: ");
        String word = sc.next();
        word = word.toLowerCase();
        int vowels = 0, consonants = 0;
        char[] letters = word.toCharArray();
        for (char letter : letters){
            if(letter=='a'||letter=='e'||letter=='i'||letter=='o'||letter=='u'){
                vowels++;
            }
            else{
                consonants++;
            }
        }
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }
}
