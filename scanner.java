package com.main;

import java.util.Scanner;

public class scanner{

    public static void main(String[] args) {

        int a = 8;

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:" );
        int number = sc.nextInt();

        Scanner vc = new Scanner(System.in);
        System.out.println("Введите число №2: ");
        int number2 = sc.nextInt();

        System.out.println("Первое число = " + number + " Второе число = " +number2 + " Значит получается: " + number+number2);

        sc.close();
    }
}
