package j10_StringManipulations;

public class C01_Concatenation {
    public static void main(String[] args) {

        /*
        concat() methodu içine (parametre) aldığı string variable'ı çalıştığı stringin sonuna ekler.
        javada + işlemi yapılırken en az bir string variable varsa java toplama değil concat yapar
         */

        String name=" Nur";
        String meslek="Qa tester";

        System.out.println(name.concat(meslek)); // Nur Qa tester yazar
        System.out.println(name);// Nur yazar sadece
        // String methodları variable'da geçici değişiklik yapar.
        name=meslek.concat(name);
        System.out.println("name = " + name);
        System.out.println(name.concat(true + " :)"));// String concat işlemi yaparken herşeyi string yapar

    }
}
