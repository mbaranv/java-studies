package j11_MethodCreation.homeworks;

import java.util.Scanner;

public class Task13 {

    public static void main(String[] args) {

    /*46----
    Yazılan iki String'den ikincisi, birincisinin son harflerine eşitse, true, diğer durumda false dönderen  method create ediniz

    Örnekler:
    kontrolEt("abc", "bc") ➞ true
    kontrolEt("abc", "d") ➞ false
    kontrolEt("samurai", "zi") ➞ false
    kontrolEt("feminine", "nine") ➞ true
    kontrolEt("convention", "tio") ➞ false
    */
        Scanner sc = new Scanner(System.in);
        System.out.println("Bir kelime giriniz");
        String bir = sc.nextLine();
        System.out.println("bir daha gir");
        String iki = sc.nextLine();

        kontrol(bir, iki);


    }

    private static boolean kontrol(String a, String b) {
        boolean flag = true;
        if (a.endsWith(b))
            System.out.println(flag);
        else {
            flag = false;
            System.out.println(flag);

        }
        return flag;
    }

}




