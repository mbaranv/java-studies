package J03_ScannerClass_TypeCasting.tasks;

import java.util.Scanner;

public class Task09 {


    /*
     Çiftlikteki hayvanların ayaklarının toplam sayısını bulma.
     Çiftlikteki bulunun inek, koyun, tavukların ayark sayısını hesaplayalım.

     */

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("çiftkikteki inek ve koyunların sayısını giriniz");
        int ik= sc.nextInt();
        System.out.println("çiftlikteki tavukların sayısını giriniz");
        int t= sc.nextInt();
        System.out.println("toplam ayak sayısı ="+((ik*4)+(t*2)));


    }

}
