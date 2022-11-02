package day01variables;

import java.util.Scanner;

public class gunduz1 {

    public static void main(String[] args) {
        //        1 2 3 4 5 6
        //         2 3 4 5 6
        //          3 4 5 6
        //           4 5 6
        //            5 6
        //             6


//        for (int i = 1; i <7; i++) {
//
//            for (int j = 1; j < i; j++) {
//
//                System.out.print(" ");
//
//            }
//
//            for (int k = i; k <7; k++) {
//                System.out.print(k + " ");
//            }
//            System.out.println();
//
//        }
//        System.out.println();

        /*

            *               1234*6789
                            123*5*789
                            12*456*89
                            1*34567*9
                            *********
           * *
          *   *
         *     *
        *********


         */
//        char girdi = '*';
//
//        for (int i = 1; i < 6; i++) { // satir kontrolu
//            for (int j = 1; j < 10; j++) {  // sutun kontrolu
//
//                if ((i == 1 && j == 5) || (i == 2 && (j == 4 || j == 6)) || (i == 3 && (j == 3 || j == 7)) || (i == 4 && (j == 2 || j == 8)) || i == 5 ){
//
//                    System.out.print("*");
//                } else System.out.print(" ");
//
//
//            }
//            System.out.println();
//        Scanner input = new Scanner(System.in);
//        System.out.println("Satir sayisi giriniz...");
//        int satir = input.nextInt();
//
//
//        for(int i = 1 ; i <= satir ; i++){
//
//            for(int bosluk = satir;  bosluk >= i; bosluk--){//bosluk kontrol konsoldan uzaklastir en ust satirdaki 5 ,4 ,3  soldaki bosluk
//                System.out.print(" ");//o
//            }
//            for(int sutun = 1; sutun <= i ; sutun++){
//
//                if(sutun==1 || sutun==i){
//                    System.out.print("* ");//en distaki yildizlar
//                }else if(i==satir  ) {
//                    System.out.print("* ");//en alt satirdaki bosluk
//                }else
//                    System.out.print("  ");//3. ve  4. satirdaki bosluklar
//            }
//            System.out.println();
//        }





        for(int i=1; i<=5; i++) {



            for(int j=(5-i); j>1; j--) {
                //432
                //32
                //2


                System.out.print(i+j);

                //543
                //54
                //5



            }



            System.out.println();


        }















        }
    }
