import java.util.Random;

public class Lesson_16_Homework {


    /*

    Теория:
Version Control System, VCS -- класс программ для работы с версиями ПО.

GIT, SVN - две конкретные программы для работы с версиями ПО.

Регистрация:  https://github.com/

Инструкция на англ:
https://try.github.io/levels/1/challenges/1

Теория на русском:
https://git-scm.com/book/ru/v1/


https://www.google.by/webhp?sourceid=chrome-instant&ion=1&espv=2&ie=UTF-8#q=git

https://www.google.by/webhp?sourceid=chrome-instant&ion=1&espv=2&ie=UTF-8#q=git%20vs%20svn






     */

    //отмечать те клетки, где жизнь была хотя бы раз

    public static final int SIZE_X = 150;
    public static final int SIZE_Y = 35;
    public static final char EMPTY = ' ';
    public static final char FULL = '@';

    public static char[][] pole = new char[SIZE_Y][SIZE_X];
    public static char[][] poleD = new char[SIZE_Y][SIZE_X];


    public static int isNeighbor(int i, int j) {
        if (i < 0 || i >= SIZE_Y)
            return 0;
        if (j < 0 || j >= SIZE_X)
            return 0;
        if (pole[i][j] == EMPTY)
            return 0;
        return 1;
    }

    public static void makeLoop() {
        for (int i = 0; i < SIZE_Y; i++)
            for (int j = 0; j < SIZE_X; j++)
                poleD[i][j] = EMPTY;

        for (int i = 0; i < SIZE_Y; i++)
            for (int j = 0; j < SIZE_X; j++) {
                int neighborAliveCount = 0;
                neighborAliveCount += isNeighbor(i + 1, j + 1);
                neighborAliveCount += isNeighbor(i + 1, j);
                neighborAliveCount += isNeighbor(i + 1, j - 1);
                neighborAliveCount += isNeighbor(i, j - 1);
                neighborAliveCount += isNeighbor(i, j + 1);
                neighborAliveCount += isNeighbor(i - 1, j + 1);
                neighborAliveCount += isNeighbor(i - 1, j);
                neighborAliveCount += isNeighbor(i - 1, j - 1);
                if (pole[i][j] == EMPTY && neighborAliveCount == 3)
                    poleD[i][j] = FULL;
                if (pole[i][j] == FULL &&
                        (neighborAliveCount == 2 || neighborAliveCount == 3))
                    poleD[i][j] = FULL;
            }
        char[][] temp = poleD;
        poleD = pole;
        pole = temp;
    }

    public static void show() {
        //делаем поле пустым
        for (int i = 0; i < SIZE_Y; i++) {
            for (int j = 0; j < SIZE_X; j++)
                System.out.print(pole[i][j]);
            System.out.println();
        }
    }


    public static void main(String[] args) throws InterruptedException {
        Random random = new Random();
        for (int i = 0; i < SIZE_Y; i++)
            for (int j = 0; j < SIZE_X; j++)
                pole[i][j] = random.nextInt(20) == 0 ? FULL : EMPTY;

        pole[5][5 + 100] = FULL;
        pole[6][4 + 100] = FULL;
        pole[7][4 + 100] = FULL;
        pole[7][5 + 100] = FULL;
        pole[7][6 + 100] = FULL;


        pole[10][10] = FULL;
        pole[10][11] = FULL;
        pole[11][10] = FULL;
        pole[11][11] = FULL;


        while (true) {
            show();
            makeLoop();
            Thread.sleep(200);
        }

    }
}

