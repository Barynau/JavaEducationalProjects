import java.util.Random;
import java.util.Scanner;

/**
 * Created by st on 11/28/2016.
 */
public class Lesson_15 {
    public static final int GO_ON =1;
    public static final int DRAW =2;
    public static final int WIN_X =3;
    public static final int WIN_O =4;
    public static final char EMPTY =' ';
    public static final char SYMBOL_X ='#';
    public static final char SYMBOL_O ='@';
    
    static char[][] pole = {{EMPTY, EMPTY, EMPTY},
            {EMPTY, EMPTY, EMPTY},
            {EMPTY, EMPTY, EMPTY}};

    public static void Display(char[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (j == arr.length - 1)
                    System.out.print(arr[i][j]);
                else
                    System.out.print(arr[i][j] + "|");

            }
            System.out.println("\n------");
        }
        System.out.println();
    }
    public static void Display1(char[][] arr) {
        if(pole[0][0]==EMPTY&&pole[0][1]==EMPTY&&pole[0][2]==EMPTY )
        {
            System.out.println("       ||       ||      ");
            System.out.println("       ||       ||      ");
            System.out.println("       ||       ||      ");
            System.out.println("       ||       ||      ");
            System.out.println("       ||       ||      ");
            System.out.println("=========================");
        }
        if(pole[0][0]==SYMBOL_X&&pole[0][1]==EMPTY&&pole[0][2]==EMPTY )
        {
            System.out.println(" x   x ||       ||      ");
            System.out.println("  x x  ||       ||      ");
            System.out.println("   x   ||       ||      ");
            System.out.println("  x x  ||       ||      ");
            System.out.println(" x   x ||       ||      ");
            System.out.println("=========================");
        }
        if(pole[0][0]==EMPTY&&pole[0][1]==SYMBOL_X&&pole[0][2]==EMPTY )
        {
            System.out.println("       || x   x ||      ");
            System.out.println("       ||  x x  ||      ");
            System.out.println("       ||   x   ||      ");
            System.out.println("       ||  x x  ||      ");
            System.out.println("       || x   x ||      ");
            System.out.println("=========================");
        }
        if(pole[0][0]==EMPTY&&pole[0][1]==EMPTY&&pole[0][2]==SYMBOL_X )
        {
            System.out.println("       ||       || x   x ");
            System.out.println("       ||       ||  x x  ");
            System.out.println("       ||       ||   x   ");
            System.out.println("       ||       ||  x x  ");
            System.out.println("       ||       || x   x ");
            System.out.println("=========================");
        }
    }

    public static void makeTurn(char symbol) {
        int i;
        int j;
        do {
            Scanner scaner = new Scanner(System.in);
            int n = scaner.nextInt();
            n = n - 1;
            i = 2 - n / 3;
            j = n % 3;
        } while (pole[i][j] != EMPTY);
        pole[i][j] = symbol;

    }
public static void Bot(char symbol) throws InterruptedException {
        int i;
        int j;
        do {
            Random scaner = new Random();
            int n = scaner.nextInt(9)+1;
            n = n - 1;
            i = 2 - n / 3;
            j = n % 3;
        } while (pole[i][j] != EMPTY);
        pole[i][j] = symbol;
Thread.sleep(500);
    }

    public static int Check() {
        for (int i = 0; i < pole.length; i++)

        {
            if (pole[i][0] == pole[i][1] && pole[i][2] == pole[i][1]) {
                if (pole[i][0] == SYMBOL_X)
                    return WIN_X;
                if (pole[i][0] == SYMBOL_O)
                    return WIN_O;
            }
            if (pole[0][i] == pole[1][i] && pole[2][i] == pole[1][i]) {
                if (pole[0][i] == SYMBOL_X)
                    return WIN_X;
                if (pole[0][i] == SYMBOL_O)
                    return WIN_O;
            }

        }
        if ((pole[0][0] == pole[1][1] && pole[1][1] == pole[2][2]) ||
                (pole[2][0] == pole[1][1] && pole[1][1] == pole[0][2])) {
            if (pole[1][1] == SYMBOL_X)
                return WIN_X;
            if (pole[1][1] == SYMBOL_O)
                return WIN_O;
        }
        for (int i = 0; i < pole.length; i++) {
            for (int j = 0; j < pole[0].length; j++) {
                if (pole[i][j] == EMPTY)
                    return GO_ON;
            }
        }


        return DRAW;
    }

    public static char nextSymb(char symb) {
        if (symb == SYMBOL_X)
            return SYMBOL_O;
        return SYMBOL_X;
    }

    public static void main(String[] args) throws InterruptedException {

        int result;

        char symbol = SYMBOL_X;
        do {
            Display(pole);
            if (symbol == SYMBOL_X)
            {makeTurn(symbol);}
            else
            Bot(symbol);
            symbol = nextSymb(symbol);
            result = Check();
        }
        while (result == GO_ON);
        Display(pole);
        switch (result) {
            case DRAW:
                System.out.println("Ничья");
                break;
            case WIN_X:
                System.out.println("Победил "+ SYMBOL_X);
                break;
            case WIN_O:
                System.out.println("Победил "+ SYMBOL_O);
                break;
        }


    }
}
