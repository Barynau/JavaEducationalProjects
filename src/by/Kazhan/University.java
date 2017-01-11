package by.Kazhan;

/**
 * Created by st on 26.12.2016.
 */
public class University {
    public String nameOfUniversity;
    public Group[] groups;

    public Group getRandomGroup() {
        int randomNumber = (int) (Math.random() * groups.length);
        return groups[randomNumber];
    }
}
