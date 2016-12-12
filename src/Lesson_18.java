/**
 * Created by st on 12/12/2016.
 */
public class Lesson_18 {
    public static boolean checkString(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '{')
                count++;
            if (str.charAt(i) == '}')
                count--;
            if (count < 0)
                return false;


        }
        if (count != 0)
            return false;
        return true;
    }
    public static void main(String[] args) {

        String code ="++++++++++.";
        // Данные 1: номер активной ячейки(данные по адресу памяти)
        int i = 0;
        // Данные 2: 30000 пустых ячеек (наша память)
        char[] arr = new char [30000];
        //Данные 3: номер символа из программы котый выполняеться в данный момент(адрес в памяти)
        int now =0;
        // пока не выполнилю всю строку перехоим к следующему символу


        for (now = 0; now < code.length(); now++) {
            char command = code.charAt(now);
            if (command == '+')
            {}
            if (command == '-')
            {}
            if (command == '>')
            {}
            if (command == '<')
            {}
            if (command == '.')
            {}
            if (command == ',')
            {}
            if (command == '[')
            {}
            if (command == ']')
            {}

    }
    }

}

