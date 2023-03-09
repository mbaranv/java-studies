package j08_ifStatement_TernaryOperator.homeworks;

import java.util.Scanner;

public class Q05 {

    public static void main(String[] args) {
		/*
		TASK :
		Kullanicidan  yasini ve kilosunu alaliniz
		18 yasindan kucuk ise kan bagisi yapamaz
		18 yasindann buyuk ve 50 kilo dan hafif ise kan bagisi yapamaz.
		18 yasindan buyuk ve 50 kilodan agir ise kan bagisi yapabilir.
		 */
        Scanner sc=new Scanner(System.in);
        System.out.println("Lütfen yaşınızı giriniz");
        int yas=sc.nextInt();
        System.out.println("Lütfen kilonuzu kg cinsinden giriniz");
        int kilo=sc.nextInt();

        System.out.println(yas < 18 ? "Kan bağışı yapamazsın" : yas > 18 && kilo < 50 ? "Kanki bağışı yapamazsın" : yas > 18 && kilo > 50 ? "Bağış yapabilirsin" : "Bağışşşş yapamazsın");


    }

}
