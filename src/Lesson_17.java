/**
 * Created by st on 12/7/2016.
 */
public class Lesson_17 {
    public static void main(String[] args) {
        String s = "123456";
        System.out.println(s);
        System.out.println(s.length());
        System.out.println(s.charAt(2));

        String c = "AASDF@13sfa23afgAAsfs134";
        int A = 0;
        int counter = 0;
        int summ = 0;
        int summ1 = 0;

        for (int i = 0; i < c.length(); i++) {
            if (c.charAt(i) == '0' || c.charAt(i) == '1' || c.charAt(i) == '2' || c.charAt(i) == '3'||
                    c.charAt(i) == '4' || c.charAt(i) == '5' || c.charAt(i) == '6'||
                    c.charAt(i) == '7' || c.charAt(i) == '8' || c.charAt(i) == '9')
            {
                counter++;
                summ += (int) (c.charAt(i) - 48);
            }
            if (c.charAt(i) == 'A') {
                A++;
            }

        }

        System.out.println("Количество А = " + A);
        System.out.println("Количество чисел = " + counter);
        System.out.println("Сумма чисел = " + summ);
        System.out.println("Сумма2 чисел = " + summ1);


    }
}
