package j05_Assaignment_Atama_Operators;

public class C01_AtamaOperatörü {
    public static void main(String[] args) {
        //    =	        x = 8	    x = 8
        //    +=	    x += 3	    x = x + 3
        //    -=	    x -= 3	    x = x - 3
        //    *=	    x *= 3	    x = x * 3
        //    /=	    x /= 3	    x = x / 3
        //    %=	    x %= 3	    x = x % 3

        int yas=33;
        System.out.println(yas+5);//38
        System.out.println("yas = " + yas);//33
        System.out.println(yas+= 11);//44

        int a=5;
        System.out.println(5==3);
        String abc="Abi";//büyük küçük harf duyarlılığı olduüğu içn false verir
        String abd="abi";
        System.out.println(abc==abd);

    }
}
