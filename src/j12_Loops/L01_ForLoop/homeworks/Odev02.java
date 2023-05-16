package j12_Loops.L01_ForLoop.homeworks;

import java.util.Scanner;

public class Odev02 {
    public static void main(String[] args) {
		/*
		Task-> girilen bir String'deki rakam sayısını hesaplayan method create ediniz
		 */

        Scanner sc = new Scanner(System.in);

        System.out.println("Bir metin giriniz");
        String str = sc.nextLine();

        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) > '0' && str.charAt(i) < '9')
                count++;
        }
        System.out.println(count);
    }
}
