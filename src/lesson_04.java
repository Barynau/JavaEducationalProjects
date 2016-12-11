import java.util.Scanner;
public class lesson_04 {
    public static void main(String[] args) {

Scanner input   = new Scanner(System.in);
       //  int a =0;
       //while (a<8)
       //{
       //++a;
       //++a;
       //System.out.println(a);
       //
       //
       //}
       //System.out.println("______________________\n");
       //for (int i=8; i>0;--i)
       //{
       //System.out.println(i);
       //--i;
       //}
       //System.out.println("______________________\n");
       //for (int i=0; i<9;++i)
       //{
       //System.out.println(i);
       //++i;
       //}System.out.println("______________________\n");
       //for (int i=30; i>17;--i)
       //{
       //System.out.println(i);
       //--i;
       //--i;
       //}
       //System.out.println("______________________\n");
       //for (int i=1; i<17;i*=2)
       //{
       //System.out.println(i);
       //
       //}
       //System.out.println("______________________\n");
       //for (int i=0; i<5;++i)
       //{
       //System.out.println((i*2)+ "\t" + (30-i*3)+"\t"+(13+i)+"\t"+(int)(Math.pow(2,i)));
       int summ=0;
        int summ1=0;
        for (int i=0; i<10;++i)
        {
            System.out.println("Введите число  "+(i+1));
            int a = input.nextInt();
            summ+=a;
            if(a%2==0)
            {
                summ1+=a;
            }

        }

        System.out.println("Общая сумма = "+summ);
        if(summ1>0)
        {
            System.out.println("Сумма чётных = "+summ1);}
        else
        {
            System.out.println("Вы не ввели чётных чисел");
        }
        }


}
