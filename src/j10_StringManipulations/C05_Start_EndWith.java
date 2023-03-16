package j10_StringManipulations;

import java.util.Scanner;

public class C05_Start_EndWith {
    public static void main(String[] args) {

        //TASK: girilen email hesabının @gmail.com içermiyorsa "lütfen gmail hesabı giriniz" ,
        // @gmail.com ile bitiyorsa "hesabınınız onaylandı" aksi durumda "geçerli hesap giriniz" print eden code create ediniz
        Scanner sc = new Scanner(System.in);
        System.out.println("Lütfen Gmail hesabı giriniz");

        String gmail = sc.nextLine();
        // TERNARY
        boolean kontrol=true;
        System.out.println(!gmail.contains("@gmail.com") == kontrol ? "Lütfen gmail hesabı giriniz" : gmail.endsWith("@gmail.com") ? "Hesabınız onaylandı" : "Geçerli hesap giriniz");

        //IF-ELSE
        if (!gmail.contains("@gmail.com")) {
            System.out.println("Lütfen gmail hesabı giriniz");
        } else {
            if (gmail.endsWith("@gmail.com"))
                System.out.println("Hesabınız onaylandı");
            else System.out.println("Geçerli hesap giriniz");
        }
    }
}
