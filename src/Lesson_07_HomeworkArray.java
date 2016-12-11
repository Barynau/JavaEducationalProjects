import java.util.Scanner;
import java.util.Random;

public class Lesson_07_HomeworkArray {

    public static void main(String[] args) {


        Scanner sup = new Scanner(System.in);
        Random random = new Random();

       /* System.out.println("Введите день");
        int day = sup.nextInt();
        System.out.println("Введите месяц");
        int m = sup.nextInt();
        System.out.println("Введите год");
        int year = sup.nextInt();

        int qty = 0;
        if (m >= 2)
            qty = (30 * (m - 1)) + day;
        qty += (m / 2);

        if (m > 2 && year % 4 == 0 && !(year % 100 == 0) || m > 2 && year % 400 == 0) {
            qty -= 1;

        } else if (m > 2) {
            qty -= 2;

        }
        System.out.println("От " + 1 + "." + m + "." + year + " до " + day + "." + m + "." + year + "  " + qty + " дн.");*/

        int[] arrayIndex = new int[100];
        int[] arrayInt2000 = new int[2000];
        int lmax = 0;
        int start=0;


        for (int i = 0; i < arrayInt2000.length; i++) {
            arrayInt2000[i] = random.nextInt(100) - 50;

        }
        for (int i = 0; i < arrayInt2000.length-1; i++)
        {
            start=i;
            while(i+1<arrayInt2000.length&&arrayInt2000[i]<arrayInt2000[i++])
            {
               i++;
            }
            if (start<i&&lmax<i-start+1)
            {
                lmax=i-start+1;
            }
        }for (int i = 0; i < arrayInt2000.length-1; i++)
        {
            start=i;
            while(i+1<arrayInt2000.length&&arrayInt2000[i]<arrayInt2000[i++])
            {
               i++;
            }
            if (start<i&&lmax==i-start+1)
            {
                for (int j=start;j<start+lmax;j++)
                {
                    System.out.print(arrayInt2000[j]+" ");
                }
                System.out.println();
            }
        }

    }

}

