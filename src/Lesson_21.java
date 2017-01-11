import java.util.Enumeration;

/**
 * Created by st on 21.12.2016.
 */
public class Lesson_21 {

    enum Color{
        RED,
        WHITE,
        GREEN,
        BLACK,
        BLUE,
        PURPLE

    }
enum MatrixType{
    IPS,
    TFN,
    TN,
    AMOLED
}
public static class Touch
{
    public static String manufacture;
}
    public static class Display{
        public double d;
        public Touch touch;
    }
    public static class Battery{
        public int maxCapacity;
        public int curentCapacity;
    }
public static class Phone{
    public Color color;
}




    public static void main(String[] args) {
    //Color - тип данных c1 переменная типа Color
        Color c1= Color.BLACK;

        switch (c1) {
            case BLACK:
                System.out.println("BLACK");
                break;
            case RED:
                System.out.println("RED");
                break;
            case WHITE:
                System.out.println("WHITE");
                break;
            case GREEN:
                System.out.println("GREEN");
                break;
            case BLUE:
                System.out.println("BLUE");
                break;
            case PURPLE:
                System.out.println("PURPLE");
                break;
        }

    }
}
