package j10_StringManipulations.homeworks;

import java.util.Scanner;

public class Task07 {
    public static void main(String[] args) {
        /*
        Girilen string içindeki istenen index'deki karakteri print eden code create ediniz
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Bir metin giriniz");
        String metin=sc.nextLine();
        System.out.println("Kaçıncı sıradaki karakteri bulmak istiyorsunuz");
        int index=sc.nextInt();
        System.out.println(metin.charAt(index-1));

        //veya

         /*
        Girilen string içindeki istenen index'deki karakteri print eden code create ediniz


        Scanner sc = new Scanner(System.in);

        System.out.print("bir metin giriniz : ");
        String str = sc.next();

        System.out.println("istenen karakterin index'ini giriniz : ");
        int index=sc.nextInt();

        if (str.length()>index){
            // System.out.println(str.substring(index, index + 1));
            System.out.println(str.charAt(index));
        }else System.out.println("girdiğiniz metinde olmayan index istiyorsunuz");

*/
    }
}
