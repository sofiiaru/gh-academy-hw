package java_hw.week4;

public abstract class Professor implements Teach, Evaluatable{
    protected String name;
    protected double salary;
    protected String department;

    public Professor(String name, String department){
       this.name = name;
       this.department = department;
    }
    public abstract void teachCourse(Course course);

    public abstract void calculateSalary();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
    public void gradeStudents(){}
    public void conductLecture(){

    }

}
