package j09_SwitchStatement.homeworks;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Task06 {

	public static void main(String[] args) {
		// VIP (Very Important Person) kisaltmasinda harflerin kelime karşılığını print eden code create ediniz


		Scanner sc=new Scanner(System.in);
		System.out.println("VIP kelimesinde ki hangi harfin açılımın öğrenmek istiyorsun?");

		String harf=sc.nextLine().toLowerCase();// char harf=sc.nextLine().toLowerCase().charAt(0); şeklinde de yapabilirdik fakat aşağıda
												// caselere 'v' variable koyardık
		switch (harf){
			case "v":
				System.out.println("V : very");
				break;
			case "i":
				System.out.println("I : important");
				break;
			case "p":
				System.out.println("P : Person");
				break;
			default:
				System.out.println("Hatalı harf girdin");
				break;
		}



	}
}
