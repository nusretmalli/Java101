package com.company;

import java.util.Scanner;

public class Dortve5inKuvvetleri {

    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.println("Sinir Sayiyi Giriniz:");
        n = input.nextInt();

        System.out.println("5'in Kuvvetleri");
        for (int i = 1; i <= n; i *= 5) {
            System.out.println(i);
        }
        System.out.println("4'un Kuvvetleri");
        for (int j = 1; j <= n; j *= 4) {
            System.out.println(j);
        }
    }
}
