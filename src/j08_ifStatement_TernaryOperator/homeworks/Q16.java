package j08_ifStatement_TernaryOperator.homeworks;

import java.util.Scanner;

public class Q16 {
/* TASK :
    Kullanicidan 3 Numara isteyiniz ve bu numaralarin en buyuk ve 
    en kucuk olanlarini konsola yazdiriniz
    int num1 
    int num2 
    int num3
*/

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Lütfen 3 adet sayı giriniz");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        System.out.println(a > b && a > c ? a : b > a && b > c ? b : c > b && c > a ? c : "Hatalı giriş yaptınız");


    }
}

