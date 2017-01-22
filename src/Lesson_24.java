import by.Kazhan.Store;

/**
 * Created by st on 18.01.2017.
 */
public class Lesson_24 {
    public static void main(String[] args) {
        Store n1 =new Store();
        n1.addNewValue(123);
        n1.addNewValue(5);
        n1.addNewValue(67);
        n1.addNewValue(2);
        n1.addNewValue(234);
        n1.addNewValue(5564);
        n1.addNewValue(54);
        n1.addNewValue(4);
        n1.addNewValue(345);
        for (int i = 0; i < n1.getSize(); i++) {
            System.out.print(n1.getByIndex(i)+" ");
        }
        System.out.println();
n1.removeByIndex(2);
        for (int i = 0; i < n1.getSize(); i++) {
            System.out.print(n1.getByIndex(i)+" ");
        }
        System.out.println();
    }
}
