package j10_StringManipulations.homeworks;

        import java.util.Scanner;

public class Q07 {
    public static void main(String[] args) {

        /* TASK :
         * Kullanicidan bir isim isteyiniz ve isim sadece 3 harfli olmalidir ternary
         * kullanarak harflerin unique(farkli) olup olmadigina bakiniz e.g: ala => 3
         * Test data: ali eme all
         */

        Scanner sc=new Scanner(System.in);
        System.out.println("3 harfli bir kelime giriniz");
        String str=sc.nextLine().toUpperCase();



        System.out.println(str.length()!=3 ? "3 harfli kelime girmedin tekrar gir":
                (str.charAt(2) == str.charAt(1) || str.charAt(2) == str.charAt(0) || str.charAt(0)==str.charAt(1)
                ?"Aynı harfleri içeren kelime girmişsin": "Girilen kelimede 3 harf birbirinden farklıdır"));


    }
}