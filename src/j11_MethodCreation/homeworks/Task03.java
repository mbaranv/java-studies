package j11_MethodCreation.homeworks;

import java.util.Scanner;

public class Task03 {

    public static void main(String[] args) {
        // Saati saniyeye, mil'i kilometreye, kilogrami gram'a
        // ceviren bir method yaziniz.

        Scanner sc = new Scanner(System.in);

        System.out.println("Dönüşüm yapmak istediğiniz menüyü seçin \n1.Zaman \n2.Uzunluk \n3.Ağırlık");
        int seçim = sc.nextInt();


        switch (seçim) {
            case 1: {
                System.out.println("Saat değeri giriniz");
                double zaman = sc.nextDouble();
                zamanCevirici(zaman);

                break;
            }
            case 2: {
                System.out.println("Mil değeri giriniz");
                double uzunluk = sc.nextDouble();
                uzunlukCevirici(uzunluk);

                break;
            }
            case 3:
                System.out.println("Kilogram değeri giriniz");
                double agırlık = sc.nextDouble();
                ağırlıkCevirici(agırlık);
                break;
        }


    }

    private static void ağırlıkCevirici(double kg) {
        kg *=1000;
        System.out.println(kg);
    }


    private static void uzunlukCevirici(double mil) {
        mil*=1.60;
        System.out.println(mil);
    }


    private static void zamanCevirici(double saat) {
        saat*=3600;
        System.out.println(saat);

    }
    }
/*  Tek methodlu
	Scanner scan = new Scanner(System.in);
		System.out.print("saat giriniz: ");
		int saat = scan.nextInt();
		System.out.print("mil giriniz: ");
		double mil = scan.nextDouble();
		System.out.print("kilogram giriniz: ");
		double kg= scan.nextDouble();
		cevir(saat, mil, kg);
	}

	public static void cevir (int s, double m, double k) {

		int saniye = s*3600;
		double kilometre= m*1.609344;
		double gram= k/1000;

		System.out.println((s + " saat = " + saniye + " saniye , " + m + " mil = " + kilometre + " kilometre, " + k + " kilogram = " + gram + " gram"));
	}
 */