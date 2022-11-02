package day01variables;

public class soru1 {

    public static void main(String[] args) {

//        int arr[][] = {{1,2,3},{4,5},{6}};
//        int carpim =1;
//        int i ;
//
//        for (int w[] : arr){
//
//           i = w[w.length-1];
//
//           carpim = carpim*i;
//
//        }
//
//        System.out.println(carpim);
//

        String s = "accessories";
        String f = "";

        for (int i = 0; i < s.length(); i++) {

            String t = s.substring(i, i + 1);


            if (s.indexOf(t) != s.lastIndexOf(t)) {
                if (!f.contains(t)) {

                    f+=t;

                }

            }
        }
        System.out.print(f);







    }
}
