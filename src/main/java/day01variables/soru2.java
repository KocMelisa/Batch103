package day01variables;

import java.util.Arrays;

public class soru2 {

    public static void main(String[] args) {

        int[][] arr = {{1,2,3},{4,5},{6,7}};

        int brr[] = new int[3];

        for (int i =0 ; i<arr.length ; i++){

            int sum = 0;

            for (int k : arr[i]) {

                sum = sum+k;

            }

           brr[i] = sum;

            System.out.println(sum);

        }

        System.out.println(Arrays.toString(brr));


    }
}
