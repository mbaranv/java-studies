package j08_ifStatement_TernaryOperator;

import java.util.Scanner;

public class C02_ifElseStatement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ehliyetiniz var mı?");
        char kontrol = sc.nextLine().charAt(0);

        if (kontrol == 'V') {
            System.out.println("Kaç yıldır ehliyetin var");
            int yil = sc.nextInt();
            if (yil >= 7) {
                System.out.println("Kaç km mesafe kat ettiniz peki");
                int km = sc.nextInt();
                if (km >= 100000) {
                    System.out.println("Al bakalım anahtarını");
                } else {System.out.println(100000 - km + " kadar daha km kat et öyle gel");}
            }
            else System.out.println(7 - yil + " kadar daha bekle öyle gel");

        } else if (kontrol == 'Y') {
            System.out.println("Al da gel");

        } else System.out.println("Varmı yokmu aq");
    }
}
