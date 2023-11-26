package Problem_two;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Student s1 = new Student(1,"Nihan",9.5);
        Student s2 = new Student(2,"Rana",8.5);

        Faculty faculty = new Faculty(111,"LISA","CS Teacher");
        Course course = new Course();

        course.addStudent(s1);
        course.addStudent(s2);

        course.printStudentList();

        course.dropStudent(s1.getStudentId());

        course.addFaculty(faculty);


    }
}
