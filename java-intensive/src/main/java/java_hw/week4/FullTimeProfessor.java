package java_hw.week4;

import java.util.ArrayList;
import java.util.List;

public class FullTimeProfessor extends Professor{
    private List<Course> coursesTought;
    public FullTimeProfessor(String name, String department){
        super(name, department);
        calculateSalary();
        coursesTought = new ArrayList<>();
    }
    public void teachCourse(Course course){
        coursesTought.add(course);
    }

    public void calculateSalary(){
        this.salary = 4000.00;
    }


}
