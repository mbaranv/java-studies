package j10_StringManipulations;

import java.util.Scanner;

public class C03_CharAt {
    public static void main(String[] args) {

// Task-> istanbul izmir  girilen kelimenin kelimesinin ortadaki karakteri print eden code create ediniz...
        Scanner sc =new Scanner(System.in);
        System.out.println("bir kelime gir");
        String kelime= sc.nextLine();

        if (kelime.length()%2!=0){
            System.out.println(kelime.charAt((kelime.length()-1) / 2));
        }else System.out.println("girilen kelimenin orta karakteri yoktur");

        // char sayımı 0'dan başlar length 1'den başlar.length uzunluğu tek sayı olan kelimenin orta karakterini bulmak için l
        // ength-1 yaparak çift sayı yaptıktan sonra 2'ye bölerek orta karakter char sayımında ulaşmış oluruz
        // izmir in lenghti 5 dir 5-1/2 yaparak 2 sonucuna ulaşırız. elde edilen 2 char değeridir. 0,1,2 şeklinde saydığımızda izmirin 2.char
        // değeri orta karaktere denk gelir yani 'm' harfi



    }
}
