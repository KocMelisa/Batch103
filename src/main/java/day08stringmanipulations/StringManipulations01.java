package day08stringmanipulations;

import java.util.Scanner;

public class StringManipulations01 {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.println("Lutfen isminizi giriniz");

        String isim = input.next();

        char ilkHarf = isim.charAt(0);

        char sonHarf = isim.charAt(isim.length()-1);

        System.out.println("" + ilkHarf + sonHarf);

        //2.Yol

        String ilk = isim.substring(0,1);
        String son = isim.substring(isim.length()-1);

        System.out.println(ilk + son);

        //Example 2: Verilen String'deki sadece hayvan isimlerini ekrana yazdiriniz
        //           "Ben kedi, esim tavuk, oglum sever inek"

        String str = "Ben kedi, esim tavuk oglum sever inek";

        String kedi = str.substring(4,8);
        String tavuk = str.substring(15,20);
        String inek = str.substring(34);

        System.out.println(kedi+tavuk+inek);
















    }
}
