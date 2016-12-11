import java.util.Random;
import java.util.Scanner;


public class Lesson_11 {
    public static void main(String[] args) {
        Scanner sup = new Scanner(System.in);
        Random random = new Random();
        int[] arrayInt20 = new int[10];
        int size =arrayInt20.length;

        for (int i = 0; i < arrayInt20.length; i++)
        {
               arrayInt20[i]=sup.nextInt();

        }

        for (int i = 0; i < size; i++)
        {
            System.out.print(arrayInt20[i] + " ");
        }
        System.out.println();
        int countet=0;

        for (int i = 0; i < arrayInt20.length-3; i++)
        {
            if(arrayInt20[i]==arrayInt20[i+1]&&arrayInt20[i]==arrayInt20[i+2])
            {   int more=0;
                int j=4;
                while (arrayInt20[i]==arrayInt20[i+more+3])
                {
                    more++;
                }
                for (int i1 = i; i1 < arrayInt20.length-3; i1++)
                {
                    arrayInt20[i1]=arrayInt20[i1+3+more];
                }
                size-=3;
                size-=more;
                if(i<3)
                {i-=3;}
                else
                {i=0;}
            }
        }


        for (int i = 0; i < size; i++)
        {
            System.out.print(arrayInt20[i] + " ");
        }
        System.out.println();
    }
}
