import java.util.Scanner;
public class Lesson_11_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Array size");
        int size = scanner.nextInt();

        int array[] = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println();
        //где начинается повторяющаяся цепочка

        int count;

            count = 0;//сколько она длится?
            int fromIndex = 0;//От какого элемент
            for (int i = 0; i < size - 3; i++) {
                if (array[i] == array[i + 1] && array[i + 1] == array[i + 2]) {
                    count = 3;
                    while (i+count<size&&array[i] == array[i + count])
                        count++;


                    fromIndex = i;

                }
            }
            for (int i = fromIndex; i < size - count; i++)
                array[i] +=1;



        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
