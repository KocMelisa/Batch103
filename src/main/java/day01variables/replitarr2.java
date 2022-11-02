package day01variables;

import java.util.Arrays;

public class replitarr2 {

    public static void main(String[] args) {

    /*
    Array deki sayıları tolpayan Java kodunu yazınız.

    array  [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
    ```
    Beklenen Çıktı:
    ```
    Array toplamı: 55
     */
        int arr[] = {11, 12, 13, 14, 15, 16, 17, 18, 19, 100};

       // int sum = 0;

        System.out.println(Arrays.stream(arr).sorted());


/*
for (int w:arr) {
            sum = sum+w;
        }

 */


        //System.out.println("Array toplami: " + sum);
    }
}
