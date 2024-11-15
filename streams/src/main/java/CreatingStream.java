import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CreatingStream {
    public static void main(String[] args) {

        //creating stream from array
        String[] courses = {"Java", "JS", "TS"};
        Stream<String> coursesStream = Arrays.stream(courses);

        //creating stream from collection

        List<String> courseList = Arrays.asList("Java", "JS", "TS");
        Stream<String> courseStream2 = courseList.stream();

        List<Course> myCourses = Arrays.asList(
                new Course("Java", 100),
                new Course("Spring", 101),
                new Course("DS", 102),
                new Course("Microservices", 103)
        );

        Stream<Course> myCourseStream = myCourses.stream();


        //creating stream from values
        Stream<Integer> stream = Stream.of(1,2,3,4,5);



    }
}
