package day03typecastingwrapperscanner;

import java.util.Scanner;

public class Scanner03 {
    public static void main(String[] args) {
        //Kullanicidan bir dikdortgenin en ve boyunu alip cevresini hesaplayan kodu yaziniz

        Scanner input = new Scanner(System.in);

        System.out.println("Dikdortgenin enini giriniz");
        int en = input.nextInt();

        System.out.println("Dikdortgenin uzun kenarini giriniz");
        int boy = input.nextInt();

        System.out.println("Dikdortgenin alani " + en*boy);
        System.out.println("Dikdortgenin cevresi " + 2*(en+boy));

input.close();


    }
}
