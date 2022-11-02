package day09stringmanipulations;

import java.sql.SQLOutput;
import java.util.Scanner;

public class StringManipulations01 {

    public static void main(String[] args) {

        String str = "Java is easy";

        //indexOf() method'u verilen character veya caharacter'lerin "ilk gorunumunun" index'ini verir.

        int idxA = str.indexOf("a");

        System.out.println(idxA);

        //lastIndexOf() method'u verilen character veya caharacter'lerin "son gorunumunun" index'ini verir.

        int idxA2 = str.lastIndexOf("a");

        System.out.println(idxA2);

        //Example 1: Bir String'deki bir character'in tekrarli veya tekrarsiz olup olmadigini gosteren kodu yaziniz
        //           "Helloooo" ==> H-->Tekrarsiz     e-->Tekrarsiz     l-->Tekrarli     o-->Tekrarli

        String t = "Helloooo";

        if (t.indexOf("o")==t.lastIndexOf('o')){
            System.out.println("Tekrarsiz");
        } else {
            System.out.println("Tekrarli");
        }


        String u = "Learn Java earn money";

        //indexOf() iki parametre ile kullanilirsa ikinci parametrede verilen sayi kadar
        // character'i gectikten sonra istenen character'in
        //ilk gorunumunun indexini return eder.

        int sonuc = u.indexOf("n", 5);

        System.out.println(sonuc);


        String v = "";

        //isEmpty() method'u bir String'in bos olup olmadigini kontrol eder.
        //Eger String'de hic character yoksa isEmpty() "true" return eder, her hangi bir character varsa "false" return eder.
        // length()==0 demek isEmpty() true verir demektir.
        //Bir String'in bos olup olmadigini anlamak icin "length()==0" kullanmayin, "isEmpty()" kullanin

        boolean bosMu = v.isEmpty();
        System.out.println(bosMu);

        String x = " ";

        //isBlank() hem "bos String" icin hem de "sadece space" iceren String'ler icin true return eder.

        boolean blankMi = x.isBlank();
        System.out.println(blankMi);//true

        //Example 2: Kullanicidan alinan isim mutlaka space'den farkli en az 1 character icermelidir.

        Scanner input = new Scanner(System.in);

        System.out.println("Ilk isminizi giriniz...");
        String ilk = input.nextLine();

        if(ilk.isBlank()){
            System.out.println("Sana ismini gir dedim");
        } else {
            System.out.println(ilk);
        }
























    }
}
