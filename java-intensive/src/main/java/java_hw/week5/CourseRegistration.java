package java_hw.week5;

import java.util.ArrayList;
import java.util.List;

public class CourseRegistration {

    private List<Student> registeredStudents;

    public CourseRegistration(){
        registeredStudents = new ArrayList<>();
    }

    public void registerStudent(Student student){
        if(registeredStudents.size() >=5) throw new CourseFullException("The course is full");
        else registeredStudents.add(student);
    }

    public List<Student> getRegisteredStudents() {
        return registeredStudents;
    }

    public void setRegisteredStudents(List<Student> registeredStudents) {
        this.registeredStudents = registeredStudents;
    }

}
