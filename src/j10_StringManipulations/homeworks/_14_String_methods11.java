package j10_StringManipulations.homeworks;

public class _14_String_methods11 {

    public static void main(String[] args) {

        /*  apple  olan  bir String oluşturun.
            String'in apple'a eşit olup olmadığını doğrulayın.
            Büyük harf veya küçük harf önemli değildir.    */

        //Kodu aşağıya yazınız.


        String samsung="Apple";
        if (samsung.equalsIgnoreCase("apple"))
            System.out.println("Eşit");
        else System.out.println("Eşit değil");

    }
}
