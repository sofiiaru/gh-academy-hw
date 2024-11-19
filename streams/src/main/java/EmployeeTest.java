import java.util.List;

public class EmployeeTest {
    public static void main(String[] args) {

        //print all emails - 1 emp - 1 email
        EmployeeData.readAll()
                .map(Employee::getEmpEmail)
                .forEach(System.out::println);



        //print all phone numbers - 1 emp - many phone numbers
        EmployeeData.readAll()
                .map(Employee::getEmpPhoneNumbers)
                .forEach(System.out::println);

        EmployeeData.readAll()
                .flatMap(employee -> employee.getEmpPhoneNumbers().stream())
                .forEach(System.out::println);

        EmployeeData.readAll()
                .map(Employee::getEmpPhoneNumbers)
                .flatMap(List::stream)
                .forEach(System.out::println);



    }
}
