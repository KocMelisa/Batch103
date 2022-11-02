package day01variables;

import java.util.Scanner;

public class gece {

    public static void main(String[] args) {

//        INTERWIEW QUESTIONS

//        Kullanicidan bir String aliniz.
//        String'de var olan her character'in sayisini ekrana yazdiriniz.
//        Ornek: alacan ==> a = 3, l = 1, c = 1, n = 1
//        abaa   ==> a=3  b=1

//        Scanner input = new Scanner(System.in);
//
//        System.out.println("Lütfen bir kelime giriniz");
//
//        String kelime = input.next();

        String s = "accessories";
        String f = "";

        for (int i = 0; i < s.length(); i++) {

            String t = s.substring(i, i + 1);


            if (s.indexOf(t) != s.lastIndexOf(t)) {
                if (!f.contains(t)) {

                    f += t;

                }
            }

            for (int j = 0; j < f.length() ; j++) {

            }

        }

        System.out.println(f);


    }
}
