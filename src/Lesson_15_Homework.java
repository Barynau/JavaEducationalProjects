import java.util.Random;
import java.util.Scanner;

public class Lesson_15_Homework {

    //   https://ru.wikipedia.org/wiki/%D0%96%D0%B8%D0%B7%D0%BD%D1%8C_(%D0%B8%D0%B3%D1%80%D0%B0)

    //константа(неизменяемое значение)
    public static final int GO_ON = 1;
    public static final int DRAW = 2;
    public static final int WINNER_X = 3;
    public static final int WINNER_0 = 4;

    public static final char EMPTY = ' ';
    public static final char SYMBOL_X ='@';
    public static final char SYMBOL_0 = '#';
    
    static char[][] pole =
            {{EMPTY, EMPTY, EMPTY},
                    {EMPTY, EMPTY, EMPTY},
                    {EMPTY, EMPTY, EMPTY}};

    public static void display() {
        System.out.println(pole[0][0] + "|" + pole[0][1] + "|" + pole[0][2]);
        System.out.println("-----");
        System.out.println(pole[1][0] + "|" + pole[1][1] + "|" + pole[1][2]);
        System.out.println("-----");
        System.out.println(pole[2][0] + "|" + pole[2][1] + "|" + pole[2][2]);
        System.out.println();
        System.out.println();
    }

    public static void makeTurn(char symbol) {
        Scanner scanner = new Scanner(System.in);
        int i;
        int j;
        do {
            int n = scanner.nextInt();
            n = n - 1;
            i = 2 - n / 3;
            j = n % 3;
        } while (pole[i][j] != EMPTY);
        pole[i][j] = symbol;
    }

    public static void makeTurnRandom(char symbol) throws InterruptedException {
        Random random = new Random();
        int i;
        int j;
        do {
            int n = 1 + random.nextInt(9);
            n = n - 1;
            i = 2 - n / 3;
            j = n % 3;
        } while (pole[i][j] != EMPTY);
        pole[i][j] = symbol;
        Thread.sleep(1000);
    }

    public static int check() {
        //сначала проверяем победы

        //Победа Х или 0 по строкам
        //Победа Х или 0 по столбцам
        for (int i = 0; i < 3; i++) {
            if (pole[i][0] == pole[i][1] && pole[i][1] == pole[i][2]) {
                if (pole[i][0] == SYMBOL_X)
                    return WINNER_X;
                if (pole[i][0] == SYMBOL_0)
                    return WINNER_0;
            }
            if (pole[0][i] == pole[1][i] && pole[1][i] == pole[2][i]) {
                if (pole[0][i] == SYMBOL_X)
                    return WINNER_X;
                if (pole[0][i] == SYMBOL_0)
                    return WINNER_0;
            }
        }

        //Победа Х или 0 по диагоналям
        if ((pole[0][0] == pole[1][1] && pole[1][1] == pole[2][2]) ||
                (pole[0][2] == pole[1][1] && pole[1][1] == pole[2][0])) {
            if (pole[1][1] == SYMBOL_X)
                return WINNER_X;
            if (pole[1][1] == SYMBOL_0)
                return WINNER_0;
        }

        //продолжение игры
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                if (pole[i][j] == EMPTY)
                    return GO_ON;

        return DRAW;
    }


    public static void main(String[] args) throws InterruptedException {
        int result;
        char symbol = SYMBOL_X;
        do {
            display();
            if (symbol == SYMBOL_X)
                makeTurn(symbol);
            else
                makeTurnRandom(symbol);
            result = check();
            symbol = nextSymbol(symbol);
        } while (result == GO_ON);
        display();
        switch (result) {
            case DRAW:
                System.out.println("Ничья");
                break;
            case WINNER_X:
                System.out.println("Победил " + SYMBOL_X);
                break;
            case WINNER_0:
                System.out.println("Победил " + SYMBOL_0);
                break;
        }
    }

    public static char nextSymbol(char c) {
        if (c == SYMBOL_X)
            return SYMBOL_0;
        return SYMBOL_X;
    }
}
