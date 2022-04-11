package com.company;

import java.util.*;

public class Selde {
    public static int angka;
    public static int balik = 0;
    public static int temp;

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        angka = scan.nextInt();
        loop(angka);

        if(temp == balik){
            System.out.println(temp + " " + "adalah selde.");
        }
        else{
            System.out.println(temp + " " + "bukan selde.");
        }
    }
    public static void loop(int angka){
        temp = angka;
        while(angka > 0){
            balik = balik * 10;
            balik = balik + (angka % 10);
            angka = angka / 10;
        }
    }

}
