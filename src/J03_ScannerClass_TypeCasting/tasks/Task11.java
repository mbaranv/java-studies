package J03_ScannerClass_TypeCasting.tasks;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        /*
         * TASK->
         *
         * Kullaniciya gunde kac saat uyudugunu sorun,
         * ayda yilda ve 40 yilda kac gununun uykuda gectigini yazdirin
         *
         * Ornek : Input : 8
         *         Output : Ayda 10, yilda 121, 40 yilda 4866 gununuz uykuda geciyor
         */
        Scanner sc=new Scanner(System.in);
        System.out.println("Günde kaç saat uyuyorsunuz");
        int günlükUyku=sc.nextInt();
        System.out.println("Ayda toplam :"+günlükUyku*30/24+" gününz uykuda geçiyor"+"\nYılda toplam :"+günlükUyku*30/24*12+" gününz uykuda geçiyor"+"\n40 yılda toplam :"+günlükUyku*30*12*40/24+" gününz uykuda geçiyor");

    }
}
