package j10_StringManipulations.homeworks;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        /*
		 	Girilen passwordun aşagıdaki şartları sağlamasını kontrol eden coden create ediniz
		 	 a)Ilk karakteri buyuk harf olmalı
		 	 b)Son karakteri sayi olamlı
		 	 c)en az 6 karakter uzunlugunda olmalı

		 */

        Scanner sc=new Scanner(System.in);
        System.out.println("Şifre giriniz");
        String pass=sc.nextLine();

        if ((pass.charAt(0)>='A'&&pass.charAt(0)<='Z')&& pass.charAt(pass.length()-1)>='0' && pass.charAt(pass.length()-1)<='9'&&(pass.length()>5)){
            System.out.println("Password doğru");
        }else System.out.println("Password geçersiz");

// Önemli: char at kontrolü yapılırken char içindeki değerin karşılaştırması ' ' tırnağı ile
// yapılmalıdır.Sadece sayı veya String tipinde(" ") değer ile yapılmamalıdır

    }
}
