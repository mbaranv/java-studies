package j10_StringManipulations.homeworks;

import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {
        // TASK : Kullanıcıdan alacağınız bir stringde boşluk karakterinin olup olmadığını kontrol ediniz.

        Scanner sc=new Scanner(System.in);
        System.out.println("Lütfen bir şeyler yazın");
        String ifade=sc.nextLine();

        String bosluk=" ";
        boolean kontrol=true;
//IF-ELSE
        if (ifade.contains(bosluk)==kontrol) {
            System.out.println("Yazdığınız ifadede boşluk bulunmaktadır");
        }
        else System.out.println("Yazdığınız ifadede boşluk yoktur");

//TERNARY
        System.out.println(ifade.contains(bosluk) == kontrol ? "Yazdığınız ifadede boşluk bulunmaktadır" : "Yazdığınız ifadede boşluk yoktur");



    }
}

