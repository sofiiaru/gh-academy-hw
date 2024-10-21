package java_hw.week4;

import java.util.List;

public class Department {
    private String name;
    private List<Professor> professors;
    private List<Course> courses;

    public String getName() {
        return name;
    }

    public void setDepartmentName(String name) {
        this.name = name;
    }

    public List<Professor> getProfessors() {
        return professors;
    }

    public void setProfessors(List<Professor> professors) {
        this.professors = professors;
    }


}
