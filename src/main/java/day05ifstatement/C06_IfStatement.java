package day05ifstatement;

import java.util.Scanner;

public class C06_IfStatement {
    public static void main(String[] args) {

        //Kullanıcıdan 4 basamakli bir sayi girmesini isteyin.
        // Girdiği sayi 5’e  bölünüyorsa son rakamını kontrol edin.
        // Son rakamı 0 ise ekrana "5’e bölünen çift sayı" yazdırın.
        // Son rakamı 0 değil ise "5’e bölünen tek sayı" yazdırın.
        // Girdiği password 5’e bölünmüyorsa ekrana "Tekrar deneyin" yazdırın.

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen 4 basamakli bir sayi giriniz...");
        int sayi = input.nextInt();

        if (sayi < 1000 || sayi > 9999){
            System.out.println("Lutfen 4 basamakli pozitif bir sayi giriniz");
        }











    }
}
