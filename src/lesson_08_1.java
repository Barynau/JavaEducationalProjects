import java.util.Random;
import java.util.Scanner;

public class lesson_08_1 {
    public static void main(String[] args) {

        Scanner sup = new Scanner(System.in);
        Random random = new Random();
        int[] arrayInt10 = new int[10];
        int summ = 0;
        for (int i = 0; i < arrayInt10.length; i++) {
            arrayInt10[i] = random.nextInt(10);
        }
        for (int i = 0; i < arrayInt10.length; i++) {
            System.out.print(arrayInt10[i] + " ");
        }
        System.out.println();
        int temp;
        int maxIndex = 0;
        for (int i = 1; i < arrayInt10.length; i++) {
            if (arrayInt10[maxIndex] < arrayInt10[i]) {
                maxIndex = i;
            }

        }

        temp = arrayInt10[maxIndex];
        for (int i = 0; i < arrayInt10.length; i++) {
            if(arrayInt10[i]==temp)
            {
                arrayInt10[i] = arrayInt10[arrayInt10.length - 1];
            }
        }

        arrayInt10[arrayInt10.length - 1] = temp;

        for (int i = 0; i < arrayInt10.length; i++) {
            System.out.print(arrayInt10[i] + " ");
        }
        System.out.println();
    }

}
