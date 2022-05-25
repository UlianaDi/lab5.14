package com.company;
import java.util.Scanner;
public class Second {
    public static void main(String[] args) {
        String q, w, e, r, t;
        Scanner s = new Scanner(System.in);
        System.out.println("Введіть перше слово : ");
        q = s.nextLine();
        System.out.println("Введіть друге слово : ");
        w = s.nextLine();
        System.out.println("Введіть третє слово : ");
        e = s.nextLine();
        System.out.println("Введіть четверте слово : ");
        r = s.nextLine();
        System.out.println("Введіть п'яте слово : ");
        t = s.nextLine();
        System.out.println(q.substring(0,1) +  w.substring(0,1) + e.substring(0,1) +r.substring(0,1) + t.substring(0,1));

    }
}
