import java.util.*;

public class ArrayListReview {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Jose"));
        students.add(new Student(2, "Syed"));
        students.add(new Student(3, "Nick"));
        students.add(new Student(4, "Ron"));

        System.out.println(students);
        //regular for loop with get(index)
        for(int i = 0; i<students.size(); i++){
            System.out.println(students.get(i));
        }

        //iterator
        Iterator iter = students.listIterator();

        while(iter.hasNext()) {
            System.out.println(iter.next());
        }

        //backward iteration
        System.out.println("Backward iteration");
        while(((ListIterator<?>) iter).hasPrevious()) {
            System.out.println(((ListIterator<?>) iter).previous());
        }
        //for each loop
        for(Student student:students) System.out.println(student);

        //lambda
        students.forEach(student -> System.out.println(student));
        //sort by id
        Collections.sort(students, new sortByIdDesc());
        System.out.println(students);

        //sort by name
        Collections.sort(students, new sortByNameDesc());
        System.out.println(students);



    }
    static class sortByIdDesc implements Comparator<Student> {

        @Override
        public int compare(Student o1, Student o2) {
            return o2.id - o1.id;
        }
    }

    static class sortByNameDesc implements Comparator<Student> {

        @Override
        public int compare(Student o1, Student o2) {
            return o2.name.compareToIgnoreCase(o1.name);
        }
    }
}
