package j08_ifStatement_TernaryOperator.homeworks;

import java.util.Scanner;

public class _05_if_else_if_statement5 {

    public static void main(String[] args) {

    /*  90.25 ve 90.25 değerinde iki double oluşturun.
        Eğer ilk double, ikinci double'dan büyükse  "Hello World" yazdırın.
        Eğer ilk double, ikinci double'dan küçükse "Not Hello World" yazdırın.
        Aksi halde (else) "I love java" yazdırın. */

        double t = 90.25;
        double p = 90.25;
        if (t>p) System.out.println("Hello World");
        else if (t<p) System.out.println("Not Hello World");
        else System.out.println("I love java");


    }
}
