package com.company;

import java.util.Scanner;

public class ReadClass {
    public double readNextDouble() {
        Scanner sc = new Scanner(System.in);
        double i = 0;
        if (sc.hasNextDouble()) {
            i = sc.nextDouble();
            System.out.println(i);
        } else {
            System.out.println("Вы ввели не целове число");
        }
        return i;
    }

    public String redNextString () {
        Scanner pm = new Scanner(System.in);
        String reader = null;
        reader = pm.nextLine();
        return reader;
    }
}


