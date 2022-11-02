package day01variables;

import java.io.FilterOutputStream;

public class gunduz3 {

    public static void main(String[] args) {

//        //120'den 11'e kadar 4 ile bölünebilen ve 6 ile bölünebilen tüm tam sayıları aynı satırda iki
//        //ardışık tam sayı arasında boşluk bırakarak yazınız.
//
//        int a = 120;
//
//        //1.yol
//
//            for (int i = a; i > 10 ; i--){
//
//                if (i%4==0 && i%6==0){
//
//                    System.out.print(i + " ");
//
//                }
//
//
//            }
//
//
//
//        //2.yol
//
//        while(a>10){
//
//            if (a%4==0 && a%6==0){
//
//                System.out.print(a + " ");
//            }
//
//            a--;
//        }
//
//
//
//        //2.yol
//
//
//       do {
//
//           if (a%4==0 && a%6==0){
//
//                System.out.print(a + " ");
//            }
//
//            a--;
//
//       }
//       while (a>10);
//
//
//
//


        // Bir String’ de tekrarlanan karakterleri yazdırmak için kod yazınız.
        //       Örneğin; accessories ´ ces

        String s = "accessories";

        String ters = "";

        for (int i = s.length()-1 ; i>=0; i--){

            String c = s.substring(i,i+1);

            ters += c;

        }

        System.out.println(ters);







//        int i = 0;
//
//        while (i < s.length()) {
//
//            String c = s.substring(i, i + 1);
//
//            if (s.indexOf(c) != s.lastIndexOf(c)) {
//
//                if (!tekrar.contains(c)) {
//
//                    tekrar = tekrar + c;
//
//                   }
//
//            }
//
//            i++;
//        }
//
//            System.out.println(tekrar);


//        for (int i = 0; i < s.length(); i++) {
//
//            String c = s.substring(i, i + 1);
//
//            if (s.indexOf(c) != s.lastIndexOf(c)) {
//
//                if (!tekrar.contains(c)) {
//
//                    tekrar = tekrar + c;
//
//                }
//
//
//            }
//
//        }
//        System.out.print(tekrar);



    }}

