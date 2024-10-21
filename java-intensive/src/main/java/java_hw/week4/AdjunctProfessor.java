package java_hw.week4;

import java.util.ArrayList;
import java.util.List;

public class AdjunctProfessor extends Professor{

    private List<Course> coursesTought;
    public AdjunctProfessor(String name, String department){
        super(name, department);
        coursesTought = new ArrayList<>();
    }
    public void teachCourse(Course course){
        coursesTought.add(course);
    }

    public void calculateSalary(){
        this.salary = coursesTought.size() * 1000.0;
    }


}
