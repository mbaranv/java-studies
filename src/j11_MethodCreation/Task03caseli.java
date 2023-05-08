package j11_MethodCreation;

import java.util.Scanner;

public class Task03caseli {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("1.sayıyı giriniz");
        double sayı1 = sc.nextDouble();

        System.out.println("2.sayıyı giriniz");
        double sayı2 = sc.nextDouble();

        System.out.println("İşlem seçiniz");
        char seçim = sc.next().charAt(0);

seçimİşlemi(seçim,sayı1,sayı2);
    }

    private static void seçimİşlemi(char ch,double x,double y) {

        switch (ch) {

            case '+':
                toplamaMethod(x,y);
                break;
            case '-':
                çıkarmaMethod(x,y);
                break;
            case '*':
                çarpmaMethod(x,y);
                break;
            case '/':
                bölmeMethod(x,y);
                break;
            default:
                System.out.println("Hatalı seçim yaptınız");
        }
    }

    private static void bölmeMethod(double sayı1, double sayı2) {
        System.out.println("say1/sayı2 :" + (sayı1 / sayı2));
    }

    private static void çarpmaMethod(double sayı1, double sayı2) {
        System.out.println("say1*sayı2 :" + (sayı1 * sayı2));
    }

    private static void çıkarmaMethod(double sayı1, double sayı2) {
        System.out.println("say1-sayı2 :" + (sayı1 - sayı2));
    }

    private static void toplamaMethod(double sayı1, double sayı2) {
        System.out.println("say1+sayı2 :" + (sayı1 + sayı2));


    }
}
