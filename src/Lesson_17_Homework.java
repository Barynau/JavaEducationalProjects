
public class Lesson_17_Homework
{

/*



1) найти максимальное цифру в строке
2) найти кол-во числе в строке
fasdf324agfdsg
1

3) найти сумму ЧИСЕЛ в строке
afsdsa34gdf22e3dsafasdf
59

4) найти максимальное ЧИСЛО в строке

5)



https://ru.wikipedia.org/wiki/Brainfuck






на сайте github
1) Удалите полностью репозиторий
2) Cоздает новый репозиторий

локально
3)в проекте удалите .git папку
(гит забудет про ваш проект)
4) именно в папке с проектом с помощью git bash
----git init
----git remote add origin https://.....
5) проверяете содержимое (если нет - создаете)
.gitignore


6) смотрите в idea вкладку VersionControl
там должны быть файлs *.java  и .gitignore

7) add
8) commit
9) push
10) на сайте должна увидеть свои файлы


 */


    public static void mai32452345n(String[] args) {


        String  rr = "++++++++++[>+++++++>++++++++++>+++>+<<<<-]>++\n" +
                " .>+.+++++++..+++.>++.<<+++++++++++++++.>.+++.\n" +
                " ------.--------.>+.>.";

        String s = "123456";
        System.out.println(s);
        System.out.println(s.length());
        System.out.println(s.charAt(2));

        String c = "abc\"defj";
        System.out.println(c);
        System.out.println(c.length());
        System.out.println(c.charAt(3));

        String d = "bbb5aaaa3rrrree4eeefffff";
        System.out.println(d.indexOf("e"));
        System.out.println(d.charAt(1) == 'b');


    }


    public static void main(String[] args) {
        String w = "asdf14t55rwesdg4e53";
        int count = 0;
        for (int i = 0; i < w.length(); i++) {
            count += check(w.charAt(i));
        }
        System.out.println(count);
    }

    public static int check(char c) {
        if ('0' <= c && c <= '9')
            return c - '0';
        return 0;
    }

}


/*
        String d = "bbb5aaaa3rrrree4eeefffff";
Сколько символов А в строке
Сколько цифр в строке
Сумма цифр в строке


проблема1  char, а ты число?  (да\нет)

проблема2  char,а ты число? если да, то какое?
0 - если ноль или буква
1-9 если цифра 1 - 9 соотвественно

инструмент: функкция принимающая чар, отвечающая инт


 */


