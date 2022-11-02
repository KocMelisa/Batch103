package day03typecastingwrapperscanner;

import java.util.Scanner;

public class Scanner01 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Hey kullanici yasini gir...");

        byte age = input.nextByte();

        System.out.println("Hey kullanici senin yasin "  + age);



input.close();






    }

}
