package day01variables;

public class pratikk {

    public static void main(String[] args) {

        /*
        Sifre en az 8 karakter olcak
        bosluk icermemeli
        buyuk harf olmamalı
        . ile bitmeli
         */

        String passw = "asdfghj.";

        boolean first = passw.length() > 7;
        boolean second = !passw.contains(" ");
        boolean third = !passw.contains("[A-Z]");
        boolean fourth = passw.endsWith(".");

        boolean gecerli = first && second && fourth && third;

        if (gecerli) {
            System.out.println("Passwordunuz gecerlidir");
        }else {
            System.out.println("Passwordunuz gecersizdir");
        }

        System.out.println(first);//+
        System.out.println(second);//-
        System.out.println(third);//-
        System.out.println(fourth);//+

        System.out.println(gecerli);//-

//        boolean a = passw.length() >7;
//
//        boolean b = passw.contains("[^ ]");
//
//        boolean c = passw.replaceAll("[^A-Z]","").length() == 0;
//
//        boolean d = passw.endsWith(".");
//
//        boolean g = a && b && c && d;
//
//        if (passw.length() >7){
//            System.out.println(" 1. kural gecerli");
//        } else {
//            System.out.println("1. kural gecersiz");
//        }
//        if (passw.contains("[^ ]")){
//            System.out.println(" 2. kural gecerli");
//        } else {
//            System.out.println("2. kural gecersiz");
//        }



















        }
    }

