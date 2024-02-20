package org.example.application;

import org.example.services.PrintService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        PrintService<Integer> ps = new PrintService<>();

        System.out.println("How many values? ");

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            Integer value = sc.nextInt();
            ps.addValue(value);
        }
        ps.print();
        System.out.println();
        Integer x = ps.first();
        System.out.println("First: " + x);

        sc.close();
    }
}