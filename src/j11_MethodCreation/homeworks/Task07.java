package j11_MethodCreation.homeworks;

import java.util.Scanner;

public class Task07 {

    public static void main(String[] args) {

    /*
    Üç sayı arasındaki en küçük sayıyı bulan  method create ediniz

    Test data:
    12,24,34

    Beklenen Çıktı:
    12
    */
Scanner sc=new Scanner(System.in);

        System.out.println("1.sayıyı gir");
        int ilkSayı= sc.nextInt();
        System.out.println("2.sayıyı gir");
        int ikinciSayı= sc.nextInt();
        System.out.println("3.sayıyı gir");
        int ucuncuSayı= sc.nextInt();

karsılastırma(ilkSayı,ikinciSayı,ucuncuSayı);

    }

    private static void karsılastırma(int a,int b,int c) {
        int x=Math.min(a,b);
        int y=Math.min(a,c);
        int z=Math.min(b,c);

        if (x==y)
            System.out.println(a);
        else if (y==z)
            System.out.println(c);

        else System.out.println(b);
    }


}

