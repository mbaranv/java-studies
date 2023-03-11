package j09_SwitchStatement;

import java.util.Scanner;

public class C01_SwitchCase {

    public static void main(String[] args) {

//TASK:Girilen haftanın gününü fata içi veya sonu oldugunu print eden code create ediniz

        Scanner sc = new Scanner(System.in);
        System.out.println("Bugün günlerden nedir");
        String gün = sc.nextLine().toUpperCase();

        switch (gün) {

            case "PAZARTESİ":
            case "SALI":
            case "ÇARŞAMBA":
            case "PERŞEMBE":
            case "CUMA":
                System.out.println("Evet bugün " + gün + " Yani Haftaiçi");
                break;
            case "CUMARTESİ":
            case "PAZAR":
                System.out.println("Evet bugün "+gün+" Yani haftasonu");
                break;
            default:
                System.out.println("Haftada 7 gün var 8.bir gün yok tekrar gir");


        }


    }
}
