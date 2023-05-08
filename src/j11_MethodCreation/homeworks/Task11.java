package j11_MethodCreation.homeworks;

import java.util.Scanner;

public class Task11 {

    public static void main(String[] args) {

    /*
    Kullanıcının yazdığı metni, 'hacker'ların konuşma diline çevirip return eden bir method(method ismi hackerDili) yazınız.

    Hackerlar bazı harfleri sayılara çevirerek yazışabiliyorlar. Genellikle çevirdikleri harfler şu şekilde:
    s -> 5
    a -> 4
    e -> 3
    i -> 1
    o -> 0

    Test data
    hackerDili("javayı severim")
    j4v4yı 53v3r1m

    İpucu harfleri değiştirin ve ekrana yazdırın.
    */
        Scanner sc = new Scanner(System.in);

        System.out.println("Bir şeyler söyle");
        String hacker = sc.nextLine();

        hackerDesifreEdici(hacker);

    }

    private static void hackerDesifreEdici(String a) {

        if (a.contains("s") || a.contains("a") || a.contains("e") || a.contains("i") || a.contains("o")) {

            System.out.println((a.replace("s", "5").
                    replace("a", "4").replace("e", "3").
                    replace("i", "1").replace("o", "0")));

        } else System.out.println(a);

    }
//NOT: replace veya replaceAll komutunu bir string için birden fazla kullanabiliriz. her replace komutunun sonuna .(nokta') koyarak kombinasyonu
    // arttırabiliriz

}