package J03_ScannerClass_TypeCasting.tasks;

import java.util.Scanner;

public class Task13 {

	public static void main(String[] args) {
		
		
		// kullanicidan 2 tam sayi alip bu 2 tamsayinin  dort islem sonucunu yazdiriniz.
		Scanner sc=new Scanner(System.in);
		System.out.println("Birinci sayıyı giriniz");
		double s1=sc.nextInt();
		System.out.println("İkinci sayıyı giriniz");
		double s2=sc.nextInt();
		System.out.println("Birinci sayi ile ikinci sayininin toplamı"+(int)(s1+s2));
		System.out.println("Birinci sayi ile ikinci sayininin çıkarması"+(s1-s2));
		System.out.println("Birinci sayi ile ikinci sayininin çarpımı"+(s1*s2));
		System.out.println("Birinci sayinin ile ikinci sayiya bölümü"+(s1/s2));


	}

}
