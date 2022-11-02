package practiceAdvanced.practice01;

import java.util.Scanner;

public class Q03_RegexQuantifiers {

    public static void main(String[] args) {

        //Bir String değerin belirli sayıda karakter içerip belirli bir karakter ile bitip bitmediğini kontrol eden bir kod yazınız.

        String str = "!s";
        System.out.println(str.matches(".s"));

        //true ==> herhangi bir karakter ile başlayıp 's' harfi ile bitiyor.
        //matches() methodu regex ile çalışıp String değerin regex ile karşılaştırmasını yapar.

        System.out.println(str.matches("..s"));

        //false ==> 3 karakterli olamadığı için

        //Bir String değerin ikinci karakterinin belirli bir karakter olup olmadığını kontrol eden bir kod yazınız.

        System.out.println("&shgfh".matches(".s.*"));

        //true ==> ilk karakter herhangi biri, ikinci karakter 's'
        //  .* ==> esnek sayıda karalter(0 yada daha fazla)

        System.out.println("&shgfh".matches(".r.*"));

        //false ==> ikinci karakter uyuşmuyor.

        //Bir String değerin sadece harf içerip içermediğini kontol eden bir kod yazınız.

        System.out.println("abc".matches("[a-zA-Z]*"));

        //Bir String değerin belirli bir sayıda belirli karakterleri içerdiğini kontrol eden bir kod yazınız.

        System.out.println("abchd".matches("[a-zA-Z]{5}"));












    }
}
