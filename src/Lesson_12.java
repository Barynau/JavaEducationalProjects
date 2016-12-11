import java.util.Random;

public class Lesson_12 {


    public static void main(String[] args) {
        printFrom1to10();
        printFrom1to10(20);
        Random random = new Random();
        int[] arrayInt20 = new int[10];
        int size = arrayInt20.length;

        for (int i = 0; i < arrayInt20.length; i++) {
            arrayInt20[i] = random.nextInt(20);

        }
        outArrayRecursion(arrayInt20, 0);
        num(3456, 4);
    }

    public static void printFrom1to10() {
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void printFrom1to10(int x) {
        for (int i = 1; i <= x; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void theAreaOfARectangle(int a, int b) {
        System.out.println(a * b);

    }

    public static void MaxElement(int a, int b, int c) {
        if (a > b && a > c) {
            System.out.println(a);
        } else if (b > c)
            System.out.println(b);
        else
            System.out.println(c);

    }


    public static void outArrayRecursion(int a[], int start) {
        System.out.print(a[start] + " ");
        if (start == a.length - 1) {

            System.out.println();
        } else
            outArrayRecursion(a, start + 1);
    }

    public static void num(int a, int b) {
        if (b > 0) {
            System.out.print(a / (int) Math.pow(10, b - 1));
            num(a % (int) Math.pow(10, b - 1), b - 1);
        } else
            System.out.println();
    }

    public static void printArray(int a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);

        }
        System.out.println();

    }

    public static int[] CreateRandomArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        return array;
    }
}
