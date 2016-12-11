import java.util.Random;
import java.util.Scanner;

public class lesson_08 {
    public static void main(String[] args) {

        Scanner sup = new Scanner(System.in);
        Random random = new Random();
        int[] arrayInt10 = new int[10];
        int summ = 0;

        for (int i = 0; i < arrayInt10.length; i++) {
            arrayInt10[i] = 20 + random.nextInt(81);

        }
        for (int i = 0; i < arrayInt10.length; i++) {
            System.out.print(arrayInt10[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < arrayInt10.length; i++) {
            summ += arrayInt10[i];
        }
        int max = arrayInt10[0];

        int min = arrayInt10[0];
        for (int i = 0; i < arrayInt10.length; i++) {
            if (arrayInt10[i] < min) {
                min = arrayInt10[i];
            }
            if (arrayInt10[i] > max) {
                max = arrayInt10[i];
            }

        }
        int summEven = 0;
        int summElementsEvenIterators = 0;
        for (int i = 0; i < arrayInt10.length; i++) {
            if (i % 2 == 0) {
                summElementsEvenIterators += arrayInt10[i];
            }
            if (arrayInt10[i] % 2 == 0) {
                summEven += arrayInt10[i];
            }
        }

        System.out.println("Сумма элементов массива = " + summ);
        System.out.println("Максимальный эллемент массива = " + max);
        System.out.println("Минимальный элемент массива = " + min);
        System.out.println("Сумма чётных элементов массива = " + summEven);
        System.out.println("Сумма  элементов массива находящихся на чётных позициях = " + summElementsEvenIterators);
        int temp = arrayInt10[arrayInt10.length - 1];
        for (int i = arrayInt10.length - 1; i > 0; i--) {
            arrayInt10[i] = arrayInt10[i - 1];
       }
        arrayInt10[0] = temp;
        for (int i = 0; i < arrayInt10.length; i++) {
            System.out.print(arrayInt10[i] + " ");
        }
        System.out.println();
        temp = arrayInt10[0];
        for (int i = 0; i < arrayInt10.length-1; i++) {
            arrayInt10[i] = arrayInt10[i + 1];
        }
        arrayInt10[arrayInt10.length - 1] = temp;
        for (int i = 0; i < arrayInt10.length; i++) {
            System.out.print(arrayInt10[i] + " ");
        }
        System.out.println();
    }

}
