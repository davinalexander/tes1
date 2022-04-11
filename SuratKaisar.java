package com.company;

import java.util.*;

public class SuratKaisar {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);

        String plaintext = scan.nextLine();
        int jumlahPergeseran = scan.nextInt();

        System.out.println(suratKaisar(plaintext,jumlahPergeseran));
    }
    public static String suratKaisar(String teks, int pergeseran){
        String chipertext = "";
        char alpabet;

        for (int i = 0; i < teks.length(); i++){
            alpabet = teks.charAt(i);

            if (alpabet >= 'a' && alpabet <= 'z'){
                alpabet = (char) (alpabet + pergeseran);

                if (alpabet > 'z'){
                    alpabet = (char) (alpabet + 'a' - 'z' - 1);
                }
                chipertext = chipertext + alpabet;
            }else if (alpabet >= 'A' && alpabet <= 'Z'){
                alpabet = (char) (alpabet + pergeseran);

                if (alpabet > 'Z'){
                    alpabet = (char) (alpabet + 'A' - 'Z' - 1);
                }
                chipertext = chipertext + alpabet;
            }else {
                chipertext = chipertext + alpabet;
            }
        }
        return chipertext;
    }
}