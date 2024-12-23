import Models.School;
import Models.Student;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\Users\\Ruslan\\IdeaProjects\\Assignments\\src\\teachers.txt");

        Scanner sc = new Scanner(file);
        var school = new School();
        while (sc.hasNextLine()) {
            String name = sc.next();
            String surname = sc.next();
            int age = sc.nextInt();
            String gender = sc.next();
            String course = sc.next();
            int years = sc.nextInt();
            int salary = sc.nextInt();
            var teacher = new Teacher(name,surname,age,gender,course,years,salary);
            school.addMember(teacher);
        }

        file = new File("C:\\Users\\Ruslan\\IdeaProjects\\Assignments\\src\\students.txt");

        sc = new Scanner(file);
        while (sc.hasNextLine()) {
            String name = sc.next();
            String surname = sc.next();
            int age = sc.nextInt();
            String gender = sc.next();

            var student = new Student(name, surname, age, gender);

            while (sc.hasNextInt()) {
                student.addGrade(sc.nextInt());
            }
            school.addMember(student);
        }
        school.sortMembers();
        System.out.println(school);
    }
}