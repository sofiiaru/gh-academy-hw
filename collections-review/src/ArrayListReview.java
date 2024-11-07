import java.util.ArrayList;
import java.util.List;

public class ArrayListReview {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Jose"));
        students.add(new Student(2, "Syed"));
        students.add(new Student(3, "Nick"));
        students.add(new Student(4, "Ron"));

        System.out.println(students);

    }
}
