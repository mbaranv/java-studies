package j10_StringManipulations;

import java.util.Scanner;

public class C04_Contains {
    public static void main(String[] args) {


        String s1="Baran Bey başarılı bir Qa tester team lead";

        System.out.println(s1.contains("bey"));//false büyük küçük harf duyarlı
        System.out.println(s1.contains("B"));// true
        s1.contains(" ");// true

        String s2="Qa";

        System.out.println(s1.contains(s2));//true  (s1 içerirmi s2'yi demek)
        System.out.println(s2.contains(s1));//false  tam tersi


        Scanner sc=new Scanner(System.in);
        System.out.println("Bir kelime gir");
        String kelime=sc.nextLine();





    }
}
