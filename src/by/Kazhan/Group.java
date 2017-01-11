package by.Kazhan;

/**
 * Created by st on 26.12.2016.
 */
public class Group {
    public int numberOfGroup;
    public Student[] students;
    public int level;

    public Student getRandomStudent() {
        int randomNumber = (int) (Math.random() * students.length);
        return students[randomNumber];
    }
}
