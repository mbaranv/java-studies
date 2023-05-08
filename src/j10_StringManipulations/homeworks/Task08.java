package j10_StringManipulations.homeworks;

public class Task08 {
    public static void main(String[] args) {
        /*  TASK :
   Asagidaki String degiskenini kullanarak  konsolda isminizi yazdiriniz.
   String  harfDepo = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    */

        String  harfDepo = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println(harfDepo.length());

       char B=harfDepo.charAt(harfDepo.indexOf("B"));
       char A=harfDepo.charAt(harfDepo.indexOf('A'));
       char R=harfDepo.charAt(harfDepo.indexOf('R'));
       char A2=harfDepo.charAt(harfDepo.indexOf('A'));
       char N=harfDepo.charAt(harfDepo.indexOf('N'));


        System.out.println(harfDepo.indexOf('B'));


        System.out.println(""+B+A+R+A2+N);//başa string koymasaydık ascii değerlerini toplayıp sayı verirdi



    }
}
