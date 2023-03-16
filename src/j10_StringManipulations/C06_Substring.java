package j10_StringManipulations;

import java.util.Scanner;

public class C06_Substring {
    public static void main(String[] args) {

        String str = "Java bilen sırtı yere gelmez :)";
        System.out.println(str.substring(10));

        //str datasının son 10 karakterini yazdırınız
        System.out.println(str.substring(str.length() - 10));// gelmez :)
        System.out.println(str.substring(0,10));//ilk 10 karakter
        System.out.println(str.substring(0, 1));// ilk karakter

        //girilen 4harfli kelimeyi tersten print ediniz


        Scanner sc=new Scanner(System.in);
        System.out.println("Lütfen 4 harfli bir kelime giriniz");
        String kelime=sc.nextLine();

  if(kelime.length()!=4) {
      System.out.println("4 harfli girmedin");
  }else {
      System.out.print(kelime.substring(3, 4));
      System.out.print(kelime.substring(2, 3));
      System.out.print(kelime.substring(1, 2));
      System.out.print(kelime.substring(0, 1));



  }


    }
}
