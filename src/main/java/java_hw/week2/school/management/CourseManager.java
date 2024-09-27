package java_hw.week2.school.management;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CourseManager {
    private List<Student> students;

    public CourseManager() {
        students = new ArrayList<>();
    }

    public void addStudent(Student... student) {
        Arrays.stream(student).forEach(x -> students.add(x));
    }
    public void removeStudent(Student student) {
        students.remove(student);
    }

    public void modifyEnrollment(Student student, String course) {
        student.dropCourse(course);
    }

    public void displayAllStudents() {
        students.forEach(x ->
                {
                    System.out.println("Student ID: " + x.getStudentID());
                    System.out.println("Name: " + x.name);
                    System.out.println("Age: " + x.getAge());
                }
                );
    }

}
