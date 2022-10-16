package J03_ScannerClass_TypeCasting.homeworks.ScannerTasks;

import java.util.Scanner;

public class _23_Scanner2 {

    public static void main(String[] args) {

    /*   kullanıcının yasını print eden code create ediniz  */

int yas=30;
        System.out.println("Yaşınız :"+yas);

        Scanner sc=new Scanner(System.in);
        System.out.println("Doğum yılınızı giriniz");
        int dogumYılı=sc.nextInt();
        System.out.println("Yaşınız :"+(2022-dogumYılı));




    }
}
