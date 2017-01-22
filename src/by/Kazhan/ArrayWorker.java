package by.Kazhan;

/**
 * Created by st on 26.12.2016.
 */
public class ArrayWorker {



    private int[] array;

    public ArrayWorker(int[] array) {
        this.array = array;
    }

    public int getMax() {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max)
                max = array[i];
        }
        return max;
    }
    public int getMin() {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > min)
                min = array[i];
        }
        return min;
    }



    public int[] sortAscending()
    {int copy[]=new int[array.length];
        for (int i = 0; i < copy.length; i++) {
            copy[i]=array[i];
        }

        return copy;
    }
 // sort descending
    public int[] CreateArray(int size)

    {
        int[] a = new int[size];
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 100);

        }
        return a;
    }

    public void printArray(int[] a) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");

        }
        System.out.println();
    }
}
