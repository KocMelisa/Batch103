package day01variables;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class pratikkkkkk {

    public static void main(String[] args) {

        //Example 1: Bir List'teki elemanlardan birbirine en yakin olan ikisini bulunuz.
        //              [12, 15, 19, 30, 21] ===> [19, 21]


        List<Integer> a = new ArrayList<>();

        a.add(12);
        a.add(15);
        a.add(19);
        a.add(30);
        a.add(21);



        Collections.sort(a); //List'teki elemanlari kucukten buyuge dizebilmek icin kullanilir.
        System.out.println(a); //[12, 15, 19, 21, 30]


        int minFark = Integer.MAX_VALUE;
        int sayi1 = 0;
        int sayi2 = 0;

        for (int i = 1; i < a.size(); i++) {

            minFark = Math.min(minFark, a.get(i) - a.get(i-1));

        }

        for (int i = 1; i < a.size(); i++) {

            if (minFark == a.get(i) - a.get(i - 1)) {

                sayi1 = a.get(i);
                sayi2 = a.get(i - 1);

                System.out.println(sayi1 + " , " + sayi2);
            }
        }




        }
}
