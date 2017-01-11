package by.Kazhan;

/**
 * Created by st on 26.12.2016.
 */
public class ArrayWorker { public int count = 0;

    public int getMax(int[] a) {
        int max = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max)
                max = a[i];
        }
        count++;
        return max;
    }

    public int[] CreateArray(int size)

    {
        int[] a = new int[size];
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 100);

        }
        count++;
        return a;
    }

    public void printArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");

        }
        System.out.println();
        count++;
    }
}
