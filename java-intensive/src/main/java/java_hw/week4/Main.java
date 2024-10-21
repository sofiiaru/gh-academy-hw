package java_hw.week4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Professor p1 = new FullTimeProfessor("John Doe", "Computer Science");
        Professor p2 = new AdjunctProfessor("Arthur Davis", "Mathematics");
        List<Professor> professors = new ArrayList<>();
        professors.add(p1);
        professors.add(p2);

    }
}
