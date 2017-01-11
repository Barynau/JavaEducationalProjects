package by.Kazhan;

/**
 * Created by st on 26.12.2016.
 */
public class Student {
    public String fio;
    boolean sex;
    int age;
    public int level;

    public void drunkBeer() {
        level--;
        System.out.println("Ммм… пиво…");
    }

    public void readBook() {
        level++;
    }
}
