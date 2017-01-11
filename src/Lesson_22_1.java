import by.Kazhan.Group;
import by.Kazhan.Student;
import by.Kazhan.University;

/**
 * Created by st on 26.12.2016.
 */
public class Lesson_22_1 {
    public static void main(String[] args) {
        University university =new University();

       university.groups=new Group [3];
        for (int i = 0; i < university.groups.length; i++) {


            university.groups[i]=new Group();
            university.groups[i].students=new Student[3];
            for (int j = 0; j < university.groups[i].students.length; j++) {
                university.groups[i].students[j]=new Student();
            }
        }

        for (int i = 0; i <30 ; i++) {
            university.getRandomGroup().getRandomStudent().readBook();

        }
        for (int i = 0; i <20 ; i++) {
            university.getRandomGroup().getRandomStudent().drunkBeer();

        }


    }
}
