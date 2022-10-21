package J03_ScannerClass_TypeCasting.tasks;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {

        // Write a Java program to convert temperature from Fahrenheit to Celsius degree.

// formula

        // c = (f-32)*5/9
        Scanner sc=new Scanner(System.in);
        System.out.println("Converter From Fahrenheit to Celcius Temparature");
        System.out.println("Fahrenheit sıcaklığı giriniz");
        double fah=sc.nextInt();
        double cel=(fah-32)*5/9;
        System.out.println(fah+"sıcaklığı "+cel+" Celsius derecesine eşittir");






    }





}
