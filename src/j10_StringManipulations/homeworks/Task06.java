package j10_StringManipulations.homeworks;

import java.util.Scanner;

public class Task06 {
    public static void main(String[] args) {

        /*
        Girilen String'in son karakterini silen code create ediniz...
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Bir cümle girin");
        String cumle=sc.nextLine();

        System.out.println(cumle.substring(0, cumle.length() - 1));

    }
}
