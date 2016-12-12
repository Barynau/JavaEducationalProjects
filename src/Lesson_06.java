import java.util.Random;
import java.util.Scanner;


public class Lesson_06 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner sup = new Scanner(System.in);

        int x=11;//ширина
        int y=6;//высота

        for (int i = 0; i < y; i++) {
            for (int j = 0; j < x; j++)

            {
               if(j<x/2+i&&j<x/2-i)
                System.out.print("*");
               else
                System.out.print(" ");

            }
            System.out.println();
        }
    }
}
