package J03_ScannerClass_TypeCasting;

public class C02_TypeCasting {
    public static void main(String[] args) {
        int num = 1453;
        double d1 = 17; //num;//k->b aw
        System.out.println("d1 = " + d1);//1453.0
        // double->b     int->k
        double db = d1 / num;//TRICK-> iki farklı data type sayi işleme girerse java
        // kucuk olan data type turu için aw yapar sonucu buyuk olan data type  olarak verir

        System.out.println("db = " + db);//db = 0.01169993117687543

    }
}
