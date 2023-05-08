package j11_MethodCreation.homeworks;

import java.util.Scanner;

public class Task06 {

    public static void main(String[] args) {
		/*
		 Kullanıcıya paralelkenar, dikdörtgen ve üçgen kelimelerinden birini 
		 ve iki sayı seçmesini söyleyin. 
         Hangi şekli seçerse, o şeklin alanını ve çevresini ekrana yazdıran programı yazınız.
		 */

        Scanner sc = new Scanner(System.in);

        System.out.println("Paralelkenar,dikdörtgen veya üçgen arasından hangi şeklin alanını ve çevresini hesaplamak istiyorsun?");
        String secim = sc.next().toLowerCase();

        if (secim.contains("paralelkenar") || secim.contains("dikdörtgen") || secim.contains("üçgen"))
            if (secim.contains("paralelkenar") || secim.contains("dikdörtgen")) {

                dörtgenHesaplama();
            } else {

                ucgenHesaplama();
            }

    }

    private static void ucgenHesaplama() {

        Scanner scan = new Scanner(System.in);

        System.out.println("Üçgenin kenar uzunluklarını giriniz \na=");
        int aa = scan.nextInt();
        System.out.println("b=");
        int bb= scan.nextInt();
        System.out.println("c=");
        int cc= scan.nextInt();
        int çevre=aa+bb+cc;
        int alan=aa*bb*cc;
        System.out.println("Alan :"+alan+"\nÇevre :"+çevre);



    }

    private static void dörtgenHesaplama() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Dörtgenin kenar uzunluklarını giriniz \nuzun kenar=");
        int aa = scan.nextInt();
        System.out.println("kısa kenar=");
        int bb= scan.nextInt();
        int çevre=(aa+bb)*2;
        int alan=aa*bb;
        System.out.println("Alan :"+alan+"\nÇevre :"+çevre);
    }

}
