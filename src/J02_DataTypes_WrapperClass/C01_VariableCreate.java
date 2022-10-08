package J02_DataTypes_WrapperClass;

public class C01_VariableCreate {

    public static void main(String[] args) {
        // 1.yol -> best practice (recomended)
        int yas=48;
        int maas=33000;
        System.out.println(yas);// 48
        System.out.println("yas");// yas
        System.out.println(maas);  //'maas.' kelimeinin sonuna nokta(.) koymak metotları önümüze getirir.
        System.out.println("baran beyin maaşı : "+maas);

        // 2.yol
        int boy; //değeri atanmayan boy isminde bir int tanımlandı (Declaration) yani atama yapılmadı ve sonunda hata verir.
        boy=48; // atama burada yapılmıştır.
        System.out.println(boy);
        //3.yol
        int yevmiye,age,kilo;//birden çok aynı tipte değişken tanımlandı
        age=33;
        yevmiye= 1000;
        kilo=99;
        // int yevmiye=1500;yaparsak hata verir TRİCK: bir variable sadece bir kez tanımlanabilir birden çok değer atanabilir
        int gunluk=1500,yil=2022,agırlık=99; // atadığımız değeleeri kullanmazsak sarı ampul uyarısı verir hata sayılmaz ama bu değeri hiç kullanmadın
                                            // gereksiz kod yazma demek istiyor
        System.out.println(gunluk);//1500
        gunluk=1800; //gunluk değeri yeni olarak 1800 atandı
        System.out.println(gunluk);
        System.out.println("gunluk değeri:" + gunluk+"yıl değeri: " + yil+ " " +yas+yevmiye+agırlık);
        System.out.println("");


    }










}
