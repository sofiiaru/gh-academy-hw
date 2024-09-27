package java_hw.week2.school.management;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student(123,"John", 22);
        Student student2 = new Student(124,"James", 23);
        Student student3 = new Student(123,"John", 22);

        student1.enrollCourses("CS50");
        student2.enrollCourses(Arrays.asList("Java", "Data Structures", "CS50"));
        student3.enrollCourses(Arrays.asList("Data Structures", "CS50"));

        student1.setTuition();
        student2.setTuition();
        student3.setTuition();

        CourseManager manager = new CourseManager();
        manager.addStudent(student1, student2, student3);

        manager.displayAllStudents();
    }
}
