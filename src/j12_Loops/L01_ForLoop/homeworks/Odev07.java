package j12_Loops.L01_ForLoop.homeworks;

public class Odev07 {

    public static void main(String[] args) {



//        1
//        2 6
//        3 7 10
//        4 8 11 13
//        5 9 12 14 15

        int siraNo = 5;
        for (int i = 1; i <= siraNo; i++) {
            int num = i;
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num = num + siraNo - j;
            }
            System.out.println();


        }

    }
}
