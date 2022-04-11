package com.company;

import java.util.*;

public class MenghitungLuas {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int pilih = scan.nextInt();

        switch (pilih) {
            case 1 :
                Persegi luas1 = new Persegi(scan.nextInt());
                luas1.luasPersegi();
                break;
            case 2 :
                Segitiga luas2 = new Segitiga(scan.nextInt(), scan.nextInt());
                luas2.luasSegitiga();
                break;

            case 3 :
                int jari = scan.nextInt();
                if(jari % 7 == 0){
                    Lingkaran luas3 = new Lingkaran(jari);
                    luas3.luasLingkaran2();
                }
                else{
                    Lingkaran luas3 = new Lingkaran(jari);
                    luas3.luasLingkaran1();
                }
                break;
        }
        if (pilih > 3){
            System.out.println("Input yang anda masukan tidak sesuai");
        }
    }
}
class Persegi {
    int sisi;
    Persegi(int sisi){
        this.sisi = sisi;
    }
    void luasPersegi(){
        int luas = sisi * sisi;
        System.out.println(luas);
    }
}
class Segitiga {
    int alas,tinggi;
    Segitiga(int alas,int tinggi){
        this.alas = alas;
        this.tinggi = tinggi;
    }
    void luasSegitiga(){
        int luas = (alas * tinggi) / 2;
        System.out.println(luas);
    }
}
class Lingkaran {
    int jari;
    Lingkaran(int jari){
        this.jari = jari;
    }
    void luasLingkaran1(){
        int luas = (int)(3.14 * jari * jari);
        System.out.println((double)(luas));
    }
    void luasLingkaran2(){
        int luas = (int)(22/7 * jari * jari) ;
        System.out.println((double)(luas));
    }
}