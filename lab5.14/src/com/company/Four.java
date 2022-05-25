package com.company;
import java.util.Scanner;
public class Four {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println(" Введіть перше слово: ");
        String word1 = scan.nextLine();
        System.out.println(" Введіть друге слово: ");
        String word2 = scan.nextLine();
        if (word1.equalsIgnoreCase(word2)) {
            System.out.println("Введені слова однакові.");
        } else {
            System.out.println("Введені слова різні.");
        }
    }
}

