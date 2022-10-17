package J03_ScannerClass_TypeCasting.homeworks.ScannerTasks;

import java.util.Scanner;

public class _27_Scanner6 {

    public static void main(String[] args) {

    /*    kullanıcının
          Doğum gününü print eden code create ediniz */

        Scanner sc = new Scanner(System.in);
        System.out.println("Hangi yıl doğdun");
        int yil=sc.nextInt();

        System.out.println("Hangi ay?");
        String ay = sc.nextLine();
sc.nextLine();
        System.out.println("Ayın kaçıncı günü;");
        int gün = sc.nextInt();

        System.out.println("Önümüzde ki doğum günün " + gün + " " + ay + " 2023 tarihin de kutlayacağız ve sen" + (2023 - yil) + "yaşına basmış olacaksın Happy Birthday");

    }
}
