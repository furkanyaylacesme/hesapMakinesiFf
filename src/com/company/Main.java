package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen 1. Sayıyı giriniz : ");
        int n1 = scanner.nextInt();
        System.out.print("Lütfen 2. Sayıyı giriniz : ");
        int n2 = scanner.nextInt();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("İşlem seçiniz : ");
        int select = scanner.nextInt();
        switch (select) {
            case 1:
                System.out.println("Toplam : " + (n1 + n2));
                break;
            case 2:
                System.out.println("Çıkarma : " + (n1 - n2));
                break;
            case 3:
                System.out.println("Çarpma : " + (n1*n2));
                break;
            case 4:
                System.out.println("Bölme : " + (n1/n2));
                break;
        }
    }
}
