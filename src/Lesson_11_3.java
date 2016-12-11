import java.util.Random;
import java.util.Scanner;

public class Lesson_11_3 {


    public static void main(String[] args) {

        Scanner sup = new Scanner(System.in);
        Random random = new Random();
        int[] arrayInt10 = new int[10];


        for (int i = 0; i < arrayInt10.length; i++) {
            arrayInt10[i] = +random.nextInt(20);

        }
        //////////////////////////// Вывод массива
        for (int i = 0; i < arrayInt10.length; i++) {
            System.out.print(arrayInt10[i] + " ");
        }
        System.out.println();
        //////////////////////////// Вывод массива
        int max1= arrayInt10[0];
        int max2= arrayInt10[0];
if(arrayInt10[0]>arrayInt10[1])
{
    max1 = arrayInt10[1];
    max2 = arrayInt10[1];
}
        for (int i = 0; i < arrayInt10.length; i++)
        {
         if (arrayInt10[i]>max1)
         {max2=max1;
          max1=arrayInt10[i];

         }
        }
        System.out.println(max2);

    }
}
