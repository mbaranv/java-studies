package J03_ScannerClass_TypeCasting.homeworks.ScannerTasks;

import java.util.Scanner;

public class _25_Scanner4 {

    public static void main(String[] args) {

        /*   kullanıcının arabansındaki kapı sayısını print eden code create ediniz.  */

        Scanner sc = new Scanner(System.in);
        System.out.println("Aracınız modeli sedan mı coupe mi?");
        String model = sc.nextLine();
        String a="sedan";
        String b="coupe";
             if (model == a) {System.out.println("Araban 5 kapılı");}
             else  if (model==b){System.out.println("Araban 3 kapılı");}
             else System.out.println(1);

        }
}

