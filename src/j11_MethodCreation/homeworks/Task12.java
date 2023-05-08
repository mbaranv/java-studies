package j11_MethodCreation.homeworks;

import java.util.Scanner;

public class Task12 {

    public static void main(String[] args) {

    /*    Kullanıcıdan alınan bir mailin doğru olup olmadığını kontrol eden method create ediniz

    Şartlar:
    * Bir mail adresinde @ karakteri olmalı
    * Bir mail adresinde . (nokta) karakteri olmalı
    * Bir mail adresinde @ karakterinden önce en az bir karakter yazılmalı (a@gmail.com gibi)

    Örnekler
    validateEmail("@gmail.com")
    Çıktı : false

    validateEmail("gmail")
    Çıktı : false

    validateEmail("hello@gmail")
    Çıktı : false

    validateEmail("hello@edabit.com")
    Çıktı : true
    */

        Scanner sc=new Scanner(System.in);

        System.out.println("Mail hesabınızı giriniz");
        String mail= sc.nextLine();

        mailKontrol(mail);

    }

    private static void mailKontrol(String içerik ){
        if (içerik.contains("@")&&içerik.contains(".")&& içerik.indexOf("@")!=0){

                System.out.println("Doğru giriş yaptınız");
        }else System.out.println("Lütfen geçerli bir mail adresi giriniz");
    }


}