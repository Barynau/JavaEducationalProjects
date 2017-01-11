/**
 * Created by st on 19.12.2016.
 */
public class Lesson_20 {
    public static class Car {
        public String color;
        public double price;
        public int length;

    }

    public static void ShowCar(Car c) {
        System.out.println("Car");
        System.out.println("Color " + c.color);
        System.out.println("Price " + c.price);
        System.out.println("Length " + c.length);

    }

    public static Car[] SortByPrice(Car[] c) {
        for (int i = 0; i <= c.length; i++) {
            for (int j = 0; j < c.length-1; j++) {
                if (c[j].price > c[j + 1].price) {
                    Car temp = c[j];
                    c[j] = c[j + 1];
                    c[j + 1] = temp;
                }

            }
        }


        return c;
    } public static Car[] SortByLength(Car[] c) {
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c.length-1; j++) {
                if (c[j].length > c[j + 1].length) {
                    Car temp = c[j];
                    c[j] = c[j + 1];
                    c[j + 1] = temp;
                }

            }
        }


        return c;
    }
public static Car SearchByPrice(Car[] c, double p)
{
    for (int i = 0; i < c.length; i++) {
        if (c[i].price==p)
        {return c[i];}
    }
    return null;
}
    public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new Car();
        Car c3 = new Car();
        c1.color = "Red";
        c1.price = 1200;
        c1.length = 2500;

        c2.color = "Black";
        c2.price = 2200;
        c2.length = 2000;

        c3.color = "White";
        c3.price = 600;
        c3.length = 2100;

        Car[] garge = new Car[3];
        garge[0] = c1;
        garge[1] = c2;
        garge[2] = c3;
        System.out.println("First");
        for (int i = 0; i < garge.length; i++) {

            ShowCar(garge[i]);
            System.out.println();


        }
        System.out.println("Sorting by Price");
        System.out.println("++++++++++++++++++++");
        SortByPrice(garge);
        for (int i = 0; i < garge.length; i++) {

            ShowCar(garge[i]);
            System.out.println();


        }
        System.out.println("Sorting by Lenght");
        System.out.println("++++++++++++++++++++++++++++++++++");
        SortByLength(garge);
        for (int i = 0; i < garge.length; i++) {

            ShowCar(garge[i]);
            System.out.println();


        }
    }

}

