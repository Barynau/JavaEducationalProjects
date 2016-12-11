import com.sun.org.apache.bcel.internal.generic.NEW;

import java.util.Random;

/**
 * Created by st on 11/30/2016.
 */
public class Lesson_16 {
    public static final int SIZE_X = 150;
    public static final int SIZE_Y = 35;
    public static final char EMPTY = ' ';
    public static final char FULL = 2587;
    public static char[][] poleMain = new char[SIZE_Y][SIZE_X];
    public static char[][] poleTemp = new char[SIZE_Y][SIZE_X];

    public static int scout(int i, int j) {
        int res = 0;
        int startI = i - 1;
        int startJ = j - 1;
        int finishI = i + 1;
        int finishJ = j + 1;
        if (startI < 0)
            startI++;
        if (startJ < 0)
            startJ++;
        if (finishI >= SIZE_Y)
            finishI--;
        if (finishJ >= SIZE_X)
            finishJ--;
        for (int i1 = startI; i1 <= finishI; i1++) {
            for (int j1 = startJ; j1 <= finishJ; j1++) {
                if (i1 == i && j1 == j)
                    continue;
                if (poleMain[i1][j1] == FULL)
                    res++;
            }
        }

        return res;
    }

    public static void showPole(char[][] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j]);

            }
            System.out.println();
        }

    }

    public static void makeLoop() {
        for (int i = 0; i < SIZE_Y; i++) {
            for (int j = 0; j < SIZE_X; j++) {
                int temp = scout(i, j);
                if (poleMain[i][j] == EMPTY) {
                    if (temp == 3) {
                        poleTemp[i][j] = FULL;
                    }
                }
                if (poleMain[i][j] == FULL) {
                    if (temp == 3 || temp == 2) {
                        poleTemp[i][j] = FULL;
                    } else {
                        poleTemp[i][j] = EMPTY;
                    }

                }
            }

        }
        for (int i = 0; i < SIZE_Y; i++) {
            for (int j = 0; j < SIZE_X; j++) {
                poleMain[i][j] = poleTemp[i][j];
            }
        }

    }

    public static void main(String[] args) throws InterruptedException {
        Random random = new Random();
        for (int i = 0; i < SIZE_Y; i++) {
            for (int j = 0; j < SIZE_X; j++) {
                poleMain[i][j] = random.nextInt(10)==0?FULL:EMPTY;
                poleTemp[i][j] = EMPTY;
            }

        }

        showPole(poleMain);

        while (true) {
            makeLoop();
            showPole(poleMain);
            Thread.sleep(500);
            System.out.println();
        }

    }
}
