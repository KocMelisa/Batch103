package day02methodcreation;

public class Car {

    public String marka = "Honda";
    public int fiyat = 20000;

    public static void main(String[] args) {

        Car myHonda = new Car();

        System.out.println(myHonda.fiyat);

        System.out.println(myHonda.marka);

        myHonda.hareketEt();
        myHonda.dur();
        //MethodCreation obj = new MethodCreation();

    }

    public static void hareketEt () {
        System.out.println("Honda guzel hareket eder");
    }

    public static void dur () {
        System.out.println("Honda guvenli durur");
    }


}
