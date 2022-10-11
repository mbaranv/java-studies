package J03_ScannerClass_TypeCasting.tasks;

import java.util.Scanner;

public class Task03 {
	
	public static void main(String[] args) {
		
		/* Soru 10:
		 * Kullanicinin girdigi 3 basamakli sayinin ilk ve son rakamlarinin toplamini veren programi yaziniz.
		 */

		Scanner sc=new Scanner(System.in);
		System.out.println("3 basamaklı sayınızı giriniz:");
		int t = sc.nextInt();
		int yuzler=t/100;
		int birler=t%10;
		System.out.println("ilk ve son rakamlarının toplamı="+(yuzler+birler));
		
	}

}
