package org.example;

import java.util.Scanner;

public class encrypt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = sc.next();

        StringBuilder e_word = new StringBuilder(" ");

        char[] letters = word.toCharArray();

        for (char letter : letters){
            int ascii = (int) letter + 5;
            char e_letter = (char) ascii;
            e_word.append(e_letter);
        }
        System.out.print(e_word);
    }
}
