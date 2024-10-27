package java_hw.week5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean answer = true;
        do{
            System.out.println("Student name: ");
            String name = input.nextLine();
            System.out.println("Student age: ");
            int age = input.nextInt();

            try{
                Student s1 = new Student(name, age);
                new CourseRegistration().registerStudent(s1);
            }catch (InvalidNameException e){
                System.err.println(e);
                System.out.println("Re-enter student's name:");
                name = input.nextLine();
            }catch (InvalidAgeException e){
                System.err.println(e);
                System.out.println("Re-enter student's age:");
                age = input.nextInt();
            }catch(CourseFullException e) {
                System.err.println(e);
            }
            System.out.println("Would you like to add another student? true/false");
            answer = input.nextBoolean();
        }while(answer);

    }
}
