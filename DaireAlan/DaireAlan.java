package com.company;
import java.util.Scanner;

public class DaireAlan {

    public static void main(String[] args) {

        float r,a,hesap;
        float pi = 3.14f;
        Scanner input = new Scanner(System.in);

        System.out.println("Dairenin Yarıçapını Giriniz:");
        r = input.nextFloat();
        System.out.println("Dairenin Merkez Açısnı Giriniz:");
        a = input.nextFloat();

        hesap = (pi*(r*r)*a)/360;

        System.out.println("Dairenin Alanı: " + hesap);

    }
}
