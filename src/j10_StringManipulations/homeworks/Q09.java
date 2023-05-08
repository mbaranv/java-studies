package j10_StringManipulations.homeworks;

import java.util.Scanner;

public class Q09 {

    public static void main(String[] args) {

		/*  TASK :
				StringMethods:
				girilen  bir strngin ilk yarisini print eden code create ediniz
	    	    ORNEK:
		     	INPUT :istanbul
				OUTPUT :ista
	    */


        Scanner sc=new Scanner(System.in);
        System.out.println("Lütfen bir ifade girin");
        String ifade=sc.nextLine();


        System.out.println(ifade.substring(0,(ifade.length()/2)));








    }
}
