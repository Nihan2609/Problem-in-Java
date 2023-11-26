package Problem_two;

import java.util.Arrays;
import java.util.Scanner;

public class Course {
    private Scanner scanner;
    private static int count = 0;
    private String courseID;
    private String courseTitle;
    private double credit;
    private final int numberOfStudents=2;
    private Student[] studentList;
    private Faculty faculty;

    public Course()
    {
        this.studentList = new Student[numberOfStudents];
    }
    public Course (String courseID,String courseTitle,double credit)
    {
        this.courseID = courseID;
        this.courseTitle = courseTitle;
        this.credit = credit;
    }
    @Override
    public String toString()
    {
        return "Course [ID: " + courseID + ", Title: " + courseTitle + ", Credit: " + credit + "]";
    }

    public void addStudent(Student s)
    {
        studentList[count] = s;
        count ++;
    }

    public void dropStudent(int studentID)
    {
        for(int i = 0; i<numberOfStudents;i++)
        {
            if(studentID == studentList[i].getStudentId())
            {
                studentList[i] = null;
            }

        }
    }

    public void addFaculty(Faculty f)
    {
        faculty = f;
    }
    public void dropFaculty()
    {
        faculty = null;
    }

    public void printStudentList()
    {
        for(int i = 0; i<numberOfStudents;i++)
        {
            System.out.println(studentList[i]);
        }
    }

}


