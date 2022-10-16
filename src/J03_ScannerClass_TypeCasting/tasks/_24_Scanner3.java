package J03_ScannerClass_TypeCasting.homeworks.ScannerTasks;

import java.util.Scanner;

public class _24_Scanner3 {

    public static void main(String[] args) {

     /*  kullanıcını sevdiği meyveyi print eden code create ediniz  */

    Scanner sc=new Scanner(System.in);
        System.out.println("En sevdiğin çerez nedir");
        String m=sc.nextLine();
        System.out.println("Tuzlu mu tuzsuz mu?");
        String t= sc.nextLine();
        System.out.println("Bu adamın en sevdiği çerez :"+t+" "+m);


    }
}
