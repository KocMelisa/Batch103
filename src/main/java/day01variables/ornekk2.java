package day01variables;

import java.util.Arrays;
import java.util.Comparator;

public class ornekk2 {

    public static void main(String[] args) {

        String sentence1 ="Icerisindeki alti harften buyuk kelimeleri bulan kodu yaziyorum";
        System.out.println(sentence1);
        sentence1 = sentence1.replaceAll("\\p{Punct}", "");
        String words1[] = sentence1.split(" ");

        Arrays.sort(words1, Comparator.comparingInt(String::length));
        System.out.println(Arrays.toString(words1));

        String word2[] = new String[words1.length];

        for(int i=0; i<words1.length; i++){

            if(words1[i].length()<6){

                word2[i]=words1[i];

            }

        }

        System.out.println(Arrays.toString(word2));

//        word2[0] = "melisa";
//
//        System.out.println(Arrays.toString(word2));
//
//
//        String arr[] = new String[3];
//
//        System.out.println(Arrays.toString(arr));

    }
}
