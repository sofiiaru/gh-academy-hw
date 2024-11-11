package lombokPractice;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
public class Student {
    private String firstName;
    private String lastName;
    private int age;
    private String email;

//use @Data - it will generate all getters, setters, toString, equals and hash code,
    //and requiredArgsConstructor


}
