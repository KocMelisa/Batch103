package day01variables;

public class soru3 {

    public static void main(String[] args) {

        // Aşağıdaki seçenekler doğrultusunda gereken kodu yazınız.
        //a) Şifre boşluk karakterinden farklı en az 8 karakter içeriyorsa "Geçerli Şifre"
        //b) Herhangi bir pozisyonda şifrede boşluk karakteri varsa "Şifrede boşluk karakteri kullanmayınız"
        //c) a ve b koşullarının sağlanmaması durumunda "Geçersiz Şifre"
        //Not: Çözümdeki koşulların sıralarına dikkat ediniz


        String Sifre = "a1b2c3d4";

        if (Sifre.replaceAll("\\S", "").length()>0){

            System.out.println("Sifrede bosluk kullanmayiniz");

        } else if (Sifre.replaceAll("\\s","").length()>=8){

            System.out.println("Gecerli Sifre");

        }else

            System.out.println("Çözümdeki koşulların sıralarına dikkat ediniz");
    }
}










