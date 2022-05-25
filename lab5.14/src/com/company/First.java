package com.company;
import java.util.Scanner;
public class First {
        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            String q, w, e, r, t;
            System.out.print("Введіть перше слово : " );
            q = s.nextLine();
            System.out.print("Введіть друге слово : " );
            w = s.nextLine();
            System.out.print("Введіть третє слово : " );
            e = s.nextLine();
            System.out.print("Введіть четверте слово : ");
            r = s.nextLine();
            System.out.print("Введіть п'яте слово : ");
            t = s.nextLine();
            q = q.concat(" " + w + " " + e + " " + r + " " + t);
            System.out.println(q);
   //       System.out.println(q + " " + w + " " + e + " " + r + " " + t)
   //       без concat я б писала так)
    }
    }
