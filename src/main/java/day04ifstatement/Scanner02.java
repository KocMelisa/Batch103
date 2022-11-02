package day04ifstatement;

import java.util.Scanner;

public class Scanner02 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //1.yol

//        System.out.println("ilk isminizi girin");
//        char ilk = input.next().charAt(0);
//
//        System.out.println("soy isminizi girin");
//        char son = input.next().charAt(0);
//
//        System.out.println(""+ ilk+son);

        //2.yol

        System.out.println("Tam isminizi giriniz...");
        String tamIsim = input.nextLine();

        char ilkHarf = tamIsim.charAt(0);

        System.out.print(ilkHarf);

        char soyIsminIlkHarfi = tamIsim.split( " ")[1].charAt(0);

        System.out.print(soyIsminIlkHarfi);




input.close();

    }
}
