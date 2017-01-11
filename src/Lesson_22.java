import by.Kazhan.ArrayWorker;

/**
 * Created by st on 26.12.2016.
 */
public class Lesson_22 {


    public static void main(String[] args) {


        ArrayWorker slave = new ArrayWorker();

        int[] a = slave.CreateArray(10);


        slave.printArray(a);
        System.out.println(slave.getMax(a));
        System.out.println(slave.count);
        ArrayWorker whiteSlave = new ArrayWorker();
        int[] b = whiteSlave.CreateArray(10);
        int[] c = whiteSlave.CreateArray(20);
        whiteSlave.printArray(a);
        whiteSlave.printArray(c);
        System.out.println(whiteSlave.getMax(c));
        System.out.println(whiteSlave.count);


    }
}
