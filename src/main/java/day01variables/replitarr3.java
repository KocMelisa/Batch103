package day01variables;

import java.util.Arrays;

public class replitarr3 {

    /*
    Arraydeki sayıların ortalamasını hesaplayan Java Kodunu yazınız.
    Array =  [20, 30, 25, 35, -16, 60, -100 ]
    ```
    Beklenen Çıktı:
    ```
    ```
    Array Sayılarının ortalaması: 7.0
     */

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};


        System.out.println(Arrays.stream(arr).average().getAsDouble());
    }
}
