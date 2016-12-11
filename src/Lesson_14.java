import java.util.Map;

/**
 * Created by st on 11/23/2016.
 */


public class Lesson_14 {
    public static void showArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + "\t");

            }
            System.out.println();
        }
        System.out.println();
    }

    public static int[][] fillArrauRandFromTo(int[][] arr, int from, int too) {
        if (from > too) {
            int temp = from;
            from = too;
            too = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {

                if (from > 0)
                    arr[i][j] = from + ((int) (Math.random() * (too + 1)));
                else
                    arr[i][j] = from + ((int) (Math.random() * (-(from) + too + 1)));
            }
        }

        return arr;
    }

    public static void main(String[] args) {

        int[][] a = new int[4][10];
        /////////////////////////////////////////////////////////////////////////////
        //Случайное заполнение двумерного массива
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                a[i][j] = (int) (Math.random() * 100);

            }
        }
        //Случайное заполнение двумерного массива
        /////////////////////////////////////////////////////////////////////////////


        showArray(a);


        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                a[i][j] = i + 1;

            }
        }


        showArray(a);


        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j] + "\t");

            }
            System.out.println();
        }

        int[][] b = new int[5][5];

        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                b[i][j] = i * b[0].length + j + 1;

            }
        }

        System.out.println();
        showArray(b);
        System.out.println();
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                if (i > j) {
                    int temp = b[i][j];
                    b[i][j] = b[j][i];
                    b[j][i] = temp;

                }
            }
        }
        showArray(b);


        int[][] c = new int[5][20];
        for (int i = 0; i < c.length; i++)
            for (int j = 0; j < c[0].length; j++)
                if (i % 2 == 0)
                    c[i][j] = i * c[0].length + j + 1;
                else
                    c[i][j] = i * c[0].length + c[0].length - j;
       showArray(c);
        System.out.println();
        fillArrauRandFromTo(c, -100, 999999);
        showArray(c);
    }
}
