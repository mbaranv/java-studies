package j01_Variables;

public class HelloWorld {


    public static void main(String[] args) {
        System.out.println("merhaba dünya");// bu komut konsola yazılan metni print eder
        /*
        bu araya yazılan her ifade yorum satırı olur,java kod olarak derlemez.
        aynen öyle
         */

/*
        System.out.println("javacılara selam olsun");//komutu çalıştırmak istemiyosak yoruma alabiliriz
        System.out.println("javacılara selam olsun");//komutu çalıştırmak istemiyosak yoruma alabiliriz
        System.out.println("javacılara selam olsun");//komutu çalıştırmak istemiyosak yoruma alabiliriz
        System.out.println("javacılara selam olsun");//komutu çalıştırmak istemiyosak yoruma alabiliriz

 */
    /*
        TRICK : javada code satırı cümle (statement) sonuna mutlaka ; koyulmalı
                Code satırında kırmızı alt çizgi uyarısı "compile time error (derleme hatası)" CTE hatası uyarısı demektir
                CTE düzeltilmeden kod çalışmaz
                print-> yazdırma işleminden sonraki komutu AYNI satırda devam ettirir
                println (line)-> yazdırma işleminden sonraki komutu AYNI satırda devam ettirir
                javad boşluk(space) karakter olarak tanımlanır

    */
        System.out.print("Benim adım : Mehmet ");
        System.out.println("Soyadım : Baran");
        System.out.println("Yaşım   : Otuz");
        System.out.println("Memleketim : Çorum");
        System.out.println("Mesleğim : işsiz");


    }



}
