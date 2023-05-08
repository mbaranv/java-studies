package j10_StringManipulations.homeworks;

import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {

        /*
         Task->
         Girilen iki kelimeden ilki çift sayıda kaqrakter içeriyorsa 2. kelimeyi 1. kelimenin ortasına print eden
         ilk kelime tek sayıda karakter içeriyorsa "kelime2 kelime1 eklenemez" print eden code create ediniz
         name1= mehmet
         name2= ahmet
         Print ==> mehahmetmet
         */


Scanner sc=new Scanner(System.in);
        System.out.println("1.kelimeyi gir");
        String ilkK=sc.nextLine();
        System.out.println("2.kelimeyi gir");
        String ikiK=sc.nextLine();

        if (ilkK.length()%2==0){
            System.out.println(ilkK.substring(0, ilkK.length() / 2) + ikiK + ilkK.substring(ilkK.length() / 2));
        }else System.out.println("Kelime2 kelime1 e eklenemez");


    }
}
