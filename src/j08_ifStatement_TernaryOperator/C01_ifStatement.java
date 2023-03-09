package j08_ifStatement_TernaryOperator;

public class C01_ifStatement {
    public static void main(String[] args) {
        int a = 33;
        int b = 40;
        if (a == b) {
            System.out.println("aynı yaştasınız");
            System.out.println("yoksa ikizmisiniz ?");
        }
        if (a >= 40) System.out.println("olgunluk yaşındasınız");//süslü parantez yok

        System.out.println("Bu yazıyı okuyorsan if den bağımsız");

        // Önceki if de süslü parantez kullanılmadığı için ifden sonra gelen
        // ilk sout komutunu koşula bağlar sonra gelenler ifden bağımsız olur


        if (a + b > 100) {
            System.out.println("a ile bnin toplamı 100 den büyük");
        }
/*
Bağımsız if statement yazıları sadece kendi scop(kapsamlarını) run eder.
Birden fazla bağımsız if statement yapıları hepsinin body çalışabileceği gibi hiç birisini body de çalışmaya bilir
 */


    }
}
