package com.company;

import java.util.Scanner;

public class ManavKasa {

    public static void main(String[] args) {

        float armut = 2.14f, elma = 3.67f, domates = 1.11f, muz = 0.95f, patlican = 5.0f;
        float s1, s2 ,s3, s4, s5, toplam;

        Scanner input = new Scanner(System.in);
        System.out.println("Armut Kaç Kilo");
        s1 = input.nextFloat();
        System.out.println("Elma Kaç Kilo");
        s2 = input.nextFloat();
        System.out.println("Domates Kaç Kilo");
        s3 = input.nextFloat();
        System.out.println("Muz Kaç Kilo");
        s4 = input.nextFloat();
        System.out.println("Patlican Kaç Kilo");
        s5 = input.nextFloat();

        toplam = (armut*s1)+(elma*s2)+(domates*s3)+(muz*s4)+(patlican*s5);
        System.out.println("Toplam Tutar: "+ toplam);

    }
}
