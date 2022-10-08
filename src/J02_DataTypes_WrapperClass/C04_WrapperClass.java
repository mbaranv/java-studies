package J02_DataTypes_WrapperClass;

public class C04_WrapperClass {
    public static void main(String[] args) {

        String name ="Mehmet";
        int yas=30;
        System.out.println(name.toLowerCase());//bütün harfleri küçük yapar
        System.out.println(name.toUpperCase());//bütün harfleri büyük yapar
//TASK: id ve tc string değerlerinin toplamını print eden kod yazınız

        String tc="123456789";
        String id="98765";
        int yeniTc=Integer.valueOf(tc);// tc string değerini int e çevirdi
        int yeniId=Integer.valueOf(id);// id string değerini int e çevirdi
        System.out.println(yeniTc+yeniId);// aritmetik toplama

        //int (yeniId,yeniTc) değerimizi yazıp . koyduktan sonra soutv metodunu çağırırsak;
        System.out.println("yeniTc = " + yeniTc);
        System.out.println("yeniId = " + yeniId);
        Integer.valueOf(tc);
        System.out.println("tc = " + tc);
        System.out.println(tc+id);//Eğer yeni int değerine atamazsak java tc ve id değerlerini string olarak görür ve sayıları toplamaz
                                    // yanyana yazar
        String okulNo="234543A";
       // int yeniOkulNo= Integer.valueOf(okulNo);// run time Exception-> çalışma zamanı hatası
       // System.out.println("yeniOkulNo = " + yeniOkulNo);

        // TASK: byte short int maximum ve minumum değerlerini print eden kod yazınız

        byte maxByteDeğeri=Byte.MAX_VALUE;//Byte->WrapperClass  MAX_VALUE -> method
        byte minByteDeğeri=Byte.MIN_VALUE;
        System.out.println("maxByteDeğeri = " + maxByteDeğeri);// Burda max/min değeri önce maxByteDeğeri adında bir kutuya atadık ve
        System.out.println("minByteDeğeri = " + minByteDeğeri);//sonra değerini yazdırdık

        System.out.println("Integer.MAX_VALUE = " + Integer.MAX_VALUE);// Burda ise herhangi bir kutuya atama yapmadan direkt
        System.out.println("Integer.MIN_VALUE = " + Integer.MIN_VALUE);// değerini yazdırdık
        System.out.println("Short.MAX_VALUE = " + Short.MAX_VALUE);
        System.out.println("\nShort.MIN_VALUE = " + Short.MIN_VALUE);



    }




}
