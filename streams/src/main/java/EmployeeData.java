import java.util.Arrays;
import java.util.stream.Stream;

public class EmployeeData {

    public static Stream<Employee> readAll() {
        return Stream.of(
                new Employee(100, "Mike", "mike@cydeo.com", Arrays.asList("2023451617", "4056987890")),
                new Employee(101, "Jane", "jane@cydeo.com", Arrays.asList("3456783456", "324567890")),
                new Employee(102, "Nick", "nick@cydeo.com", Arrays.asList("2102345674", "4056357890")),
                new Employee(103, "Joe", "joe@cydeo.com", Arrays.asList("2056751617", "4059327890"))
        );
    }
}
