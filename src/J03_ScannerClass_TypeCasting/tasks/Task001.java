package J03_ScannerClass_TypeCasting.homeworks.ScannerTasks;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        /* TASK->
		 Ask user to enter mid-term grade, final grade, and project grade
		 Calculate the general grade (mid-term : 30% , project : 20%, final : 50%)

		  Example:
		      INPUT: mid-term grade=78
		      		 final grade = 66
		      		 project grade = 90
		      OUTPUT: "Your grade is : 81,6"
*/
        Scanner sc=new Scanner(System.in);
        System.out.println("Ara sınav notunuz?");
        Integer as=sc.nextInt();
        System.out.println("Fİnal notunuz?");
        Integer fs=sc.nextInt();
        System.out.println("Proje ödev notunuz?");
        Integer pn=sc.nextInt();
        System.out.println("Ortalama notunuz: "+(as*30/100+pn*20/100+fs*50/100));

    }
}
