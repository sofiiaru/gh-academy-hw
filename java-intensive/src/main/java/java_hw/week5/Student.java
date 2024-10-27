package java_hw.week5;

public class Student {
    private String name;
    private int age;

    public Student(String name, int age) throws InvalidNameException, InvalidAgeException{
        if(name == null || name.isEmpty()) throw new InvalidNameException("Name cannot be null or empty");
        else this.name = name;

        if(age < 18 || age > 60) throw new InvalidAgeException("Age must be between 18 and 60");
        else this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
