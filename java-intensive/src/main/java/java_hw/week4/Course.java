package java_hw.week4;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Course {
    private String name;
    private double creditHours;
    private List<Student> students;

    private Map<Student, Grade> grades = new HashMap<>();
}
