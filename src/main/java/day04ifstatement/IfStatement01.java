package day04ifstatement;

public class IfStatement01 {
    public static void main(String[] args) {

        int s = 12;

    if ( s>0 ){

        System.out.println( "Positive");

    }

    char ch = 'A';

    if ( ch >= 'A' && ch <= 'Z' ){

        System.out.println("Buyuk Harf");

    }

    //sayi 3 basamakli ise ekrana 3 basamakli yazdiriniz

        int n = 123;

    n = Math.abs(n);

    if (n>= 100 && n<= 999) {
        System.out.println("Uc basamakli");
    }

        //cift sayi ise cift sayi yazdiriniz

        int p = 14;

    if (p%2 == 0){
        System.out.println("Cift sayi");
    }


//Verilen sayi 300 den kucuk yada 1200 den buyuk ise ekrana harika sayi yazdirin

        int r = 250;

    if (r<300 || r>1200){
        System.out.println("Harika sayi");

        }





    }
}
