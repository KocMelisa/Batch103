package day03typecastingwrapperscanner;

public class TypeCasting01 {

    //Type Casting; Bir numerik data tipini diger numerik data tipine cevirmek demektir.
    // byte < short< int < long < float < double


    //Note 1: Kucuk data tipini buyuk data tipine cevirmeye Auto Widening denir.
    //Note 2: Buyuk data tipini kucuk data tipine cevirmeye Explicit Norrowing denir.

    public static void main(String[] args) {

        byte age = 23;

        int newAge = age;

        long population = 1234;
        int newPopulation = (int)population;

        short numOfStudents = 25;
        double newNumOfStudents = numOfStudents;

        float price = 12.99F;

        byte newPrice = (byte)price;

        System.out.println(newPrice);

        int number = 515;

        byte newNumber = (byte)number;

        System.out.println(newNumber);


        int num = 510;
        byte newNum = (byte)num;

        System.out.println(newNum);


    }




}
