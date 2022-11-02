package day01variables;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class sorucozum {

    public static void main(String[] args) {

        int[][] arr1 = {{1, 2}, {3, 4, 5}, {6}};
        int[][] arr2 = {{7, 8, 9}, {10, 11}, {12}};

        for (int i = 0 ; i < arr1.length ; i++) {

            if (arr1[i].length < arr2[i].length){

                for (int k = 0 ; k < arr1[i].length ; k++){

                    System.out.println   (arr1[i][k] + arr2[i][k]) ;


                }

            }else {
                for (int k = 0 ; k < arr2[i].length ; k++){

                    System.out.println (arr1[i][k] + arr2[i][k]) ;

                }
            }

        }














//        int sum = 0 ;
//
//
//        for (int[] w : arr1) {
//
//            for (int k : w){
//
//                if (arr1[k].length == arr2[k].length){
//
//                    System.out.println((arr1[w][k] + arr2[w][k]););
//
//                }
//            }
//
//        }
//
//

        }
    }

