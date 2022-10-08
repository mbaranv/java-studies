package J02_DataTypes_WrapperClass;

public class C03_Concatenation {
    public static void main(String[] args) {
        String ad="Mehmet";
        String soyad="Baran";
        int a=7;
        int b=11;
        //Birden çok String variable ile farklı data type variableler + ile işleme alınırsa java birleştirme yaparak
        // yeni bir String oluşturur

        System.out.println(ad+soyad+a+b);// MehmetBaran711 yazdırır
        System.out.println(ad+soyad+(a+b));// MehmetBaran18 yazdırır
        System.out.println((a+b)+ad+soyad);// 18MehmetBaran yazdırır
        System.out.println(a+b+ad+soyad);// 18MehmetBaran yazdırır
        System.out.println(a+ad+b+soyad);// 7Mehmet11Baran yazdırır
        System.out.println(" "+a+b);// boşluk + 711 yazdırır



        int sayi1=20;
        int sayi2=34;



        // a)

        int temp=sayi1;//temp 20
        sayi1=sayi2;//sayi1 34
        sayi2=temp;//sayi2 20
        System.out.println("Swap'dan sonra sayi1 ->"+sayi1+" "+ "sayi2 ->"+sayi2);




        // b)
        sayi1=sayi1+sayi2;//54
        sayi2=sayi1-sayi2;//20
        sayi1=sayi1-sayi2;//34
        System.out.println("Swap'dan sonra sayi1 ->"+sayi2+" "+"Swap'dan sonra sayi2 ->"+sayi1);




    }
}
