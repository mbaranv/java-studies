package j12_Loops.L01_ForLoop.homeworks;

import java.util.Scanner;

public class Odev03 {

    /* Kullanıcıdan aldığımız sayının, asal olup olmadığını return eden
     * bir method create ediniz.
     *
     *  getAsalMi(int sayi)
     *  	return true/false

     * */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Bir sayı girin");
        int sayı = sc.nextInt();

        asalControl(sayı);


    }

    private static void asalControl(int p) {
        int count = 0;
        for (int i = 1; i <= p; i++) {
            if (p % i == 0)
                count++;

        }
        if (count==2)
            System.out.println("Sayı asal sayıdır");
        else System.out.println("Sayı asal sayı değildir");
    }
}
