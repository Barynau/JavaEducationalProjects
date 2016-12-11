import java.util.Scanner;


public class Lesson_03_Homework {
   public static void main(String[] args) {
      Scanner sup = new Scanner(System.in);
      //массив - совокупность однотипных данных
      //1) однотипны по смыслу
      //2) однотипны по типу данных


/*
1) создайте массив из пяти даблов
заполните их с помощью клавиатуры
покажите на экран
*/
      double[] arrayDouble5 = new double[5];
      for (int i = 0; i < arrayDouble5.length; i++) {
         System.out.println("Введите "+(i+1)+"-й элемент массива");
         arrayDouble5[i]=sup.nextDouble();

      }
      for (int i = 0; i < arrayDouble5.length; i++) {
         System.out.println(arrayDouble5[i]);
      }

/*
2) создайте массив из 10 интов
заполните его числами по порядку 1 2 3 4 ..10
посчитайте их сумму через цикл
*/
      int[] arrayInt10 = new int[10];
      int summ=0;
      for (int i = 0; i < arrayInt10.length; i++) {
         arrayInt10[i]=(i+1);
         summ+=arrayInt10[i];
      }
      System.out.println("Сумма элементов массива = "+summ);

   }
}
