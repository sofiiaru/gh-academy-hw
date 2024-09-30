package java_hw.week2.school.management;

import java_hw.week2.school.Person;

import java.util.ArrayList;
import java.util.List;

public class Student extends Person {

    private int studentID;
    private List<String> enrolledCourses = new ArrayList<>();
    private double tuition;

    public Student(int studentID, String name, int age) {
        super(name, age);
        this.studentID = studentID;
    }


    public int getStudentID() {
        return studentID;
    }

    public void enrollCourses(List<String> enrolledCourses) {
        this.enrolledCourses = enrolledCourses;
    }

    public void enrollCourses(String course) {
        enrolledCourses.add(course);
    }

    public void dropCourse(String course) {
        if(enrolledCourses.remove(course)) {
            tuition -=500;
        }
    }


    public double getTuition() {
        return tuition;
    }

    public void setTuition() {
        this.tuition = 500 * enrolledCourses.size();
    }



}
