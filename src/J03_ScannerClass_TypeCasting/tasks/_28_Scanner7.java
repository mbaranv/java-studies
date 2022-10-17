package J03_ScannerClass_TypeCasting.homeworks.ScannerTasks;

import java.util.Scanner;

public class _28_Scanner7 {

    public static void main(String[] args) {

        /*    Bir boolean oluşturunuz.
              Konsola "Bir Banka Hesabınız Var mı ? " yazınız.
              Varsa True , yoksa False olarak  konsoldan cevap veriniz.
              Boolean'ı yazdırınız.   */

        Scanner sc = new Scanner(System.in);
        boolean cevap ;
        System.out.print("Banka hesabınız varmı? E/H:");
        char ch=sc.nextLine().charAt(0);
        if (ch=='E' || ch=='e') {
            cevap = true;
            System.out.println("Hesap var :" + cevap);
        }
        else if (ch=='H'|| ch=='h'){
            cevap=false;
            System.out.println("\nHesap yok : "+ cevap);}
        else  System.out.println("Hatalı giriş");

    }
}
