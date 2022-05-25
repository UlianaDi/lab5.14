package com.company;
import java.util.Scanner;
public class Five {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введіть перший рядок: ");
        String line1 = scan.nextLine();
        System.out.println("Введіть другий рядок: ");
        String line2 = scan.nextLine();
        int l1 = line1.length();
        int l2 = line2.length();
        if (l1 > l2)
            System.out.println("Перший рядок більший за другий.");
        else if (l2 > l1)
            System.out.println("Другий рядок більший за перший.");
        else
            System.out.println("Рядки однакові.");
    }
}