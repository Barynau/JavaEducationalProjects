import java.util.Random;
import java.util.Scanner;


public class Lesson_07 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner sup = new Scanner(System.in);
/*
        int x=105040;
        int temp=x;
        int counter =0;
       while(temp>0)
       {
           temp/=10;
           counter++;
       }
        for (int i = counter; i > 0; i--)
        {

            System.out.print(x/(int)(Math.pow(10,i-1))+"|");
            x%=(int)(Math.pow(10,i-1));
        }
*/

        int[] anArray = new int[10];

      for(int i=0;i<anArray.length;i++) {
          anArray[i] = random.nextInt(100);
      }
        for (int i : anArray) {
            anArray[i] = random.nextInt(100);
        }

    }
}
