import java.util.Random;
import java.util.Scanner;

public class lesson_09 {
    public static void main(String[] args) {

        Scanner sup = new Scanner(System.in);
        Random random = new Random();
        int[] arrayInt10 = new int[10];
        int summ = 0;
        int temp = 0;

        for (int i = 0; i < arrayInt10.length; i++) {
            arrayInt10[i] = +random.nextInt(20);

        }
        //////////////////////////// Вывод массива
        for (int i = 0; i < arrayInt10.length; i++) {
            System.out.print(arrayInt10[i] + " ");
        }
        System.out.println();
        //////////////////////////// Вывод массива

        //////////////////////////// Сортировка пузырьком
        for (int i = 0; i < arrayInt10.length-1; i++) {
            for (int j = 0; j < arrayInt10.length - 1-i; j++) {
                if (arrayInt10[j] > arrayInt10[j + 1]) {
                    temp = arrayInt10[j];
                    arrayInt10[j] = arrayInt10[j + 1];
                    arrayInt10[j + 1] = temp;
                }
            }

        }
        //////////////////////////// Сортировка пузырьком

        //////////////////////////// Вывод массива
        for (int i = 0; i < arrayInt10.length; i++) {
            System.out.print(arrayInt10[i] + " ");
        }
        System.out.println();
        ///////////////////////////////// Вывод массива
    }

}
