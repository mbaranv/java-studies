package j08_ifStatement_TernaryOperator.homeworks;

import java.util.Scanner;

public class Q03 {

	public static void main(String[] args) {
		/* TASK :
		 *  Kullanicinin boyunu  m  ve kilosunu kg alarak  BMI (VKE) hesaplayiniz

	    INFO :
		BMI = kilo(kg) /(boy*boy)(m)
		BMI <=20 oldukca zayifsiniz
		20<BMI<=25 Normal sinirlardasiniz 
		25<BMI<=30 Sisman kategorisindesiniz
		30<BMI ==> Obez grubundasiniz.
		
		 */
    Scanner sc=new Scanner(System.in);
        System.out.println("Lütfen boyunuzu m cinsinden giriniz");
        double boy=sc.nextDouble();
        System.out.println("Lütfen kilonuzu kg cinsinden giriniz");
        double kilo=sc.nextDouble();


        double vke=kilo/(boy*boy);

        System.out.println(vke <= 20 ? "Oldukça zayıfsınız" : vke > 20 && vke < 25 ? "Normal sınırlardasınız" : vke > 25 && vke < 30 ? "Şişman kategoridesiniz" : vke > 30 ? "Obezsiniz" : "Hatalı işlem");


    }

}
