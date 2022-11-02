package day01variables;

public class pratik2 {

    public static void main(String[] args) {

        String s = "accessories";

        String d = "";

        for (int i = 0; i < s.length(); i++) {

            String c = s.substring(i, i + 1);

            if (s.indexOf(c) != s.lastIndexOf(c)) {

                if (!d.contains(c)) {

                    d=d+c;

                }

            }


        }
        System.out.println(d);








    }
}
