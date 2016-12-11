/**
 * Created by st on 11/21/2016.
 */
public class Lesson_13 {



    public static void ShowNumbers1(int a)
    {
        if (a<11)
        {
            System.out.print(a+"\t");
            ShowNumbers1(a+1);
        }
    }
public static void ShowNumbers2(int a)
    {
        if (a<11)
        {
            System.out.print((11-a)+"\t");
            ShowNumbers2(a+1);
        }

    }
    public static void ShowNumbers3(int a)
    {
        if (a<11)
        {
            System.out.print(a+"\t");
            ShowNumbers3(a+1);
        }
        if(a<11)
        { System.out.print(a+"\t");}


    }

    public static void main(String[] args) {
        ShowNumbers1(1);
        System.out.println();
        ShowNumbers2(1);
        System.out.println();
        ShowNumbers3(1);


    }
}
