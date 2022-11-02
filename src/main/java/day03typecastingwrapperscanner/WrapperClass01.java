package day03typecastingwrapperscanner;

public class WrapperClass01 {

    public static void main(String[] args) {

        /*
        Java primitivlere yeni bir methodlar ekleyerek yeni bir yapi olusturdu
        bu yapiya Wrapper Class diyor


        Primitive     Wrapper
        byte    ==>   Byte
        short   ==>   Short
        int     ==>   Integer
        long    ==>   Long
        float   ==>   Float
        double  ==>   Double
        boolean ==>   Boolean
        **char  ==>   Character
         */

        byte primitiveByte = 12;

        Byte wrapperByte = 12;

        System.out.println(Byte.MIN_VALUE);
        System.out.println(Byte.MAX_VALUE);

        System.out.println(Short.MIN_VALUE);
        System.out.println(Short.MAX_VALUE);

        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);

        System.out.println(Long.MIN_VALUE);
        System.out.println(Long.MAX_VALUE);


        //Primitive ler nasil Wrapperlara cevrilir AUTOBOXING

        float f1 = 13.99F;
        Float wrapperF1 = f1;

        //wrapperlar primitive lere nasil cevrilir UNBOXING

        Character w1 = 's';
        char primitiveW1 = w1;

        //Autoboxing ve Unboxing Java tarafindan otomatik olarak yapilir






    }



}
