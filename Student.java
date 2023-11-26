package Problem_two;

public class Student {
    private int studentId;
    private String studentName;
    private double studentCGPA;

    public Student()
    {
    }
    public Student(int studentId,String studentName,double studentCGPA)
    {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentCGPA = studentCGPA;
    }

    @Override
    public String toString() {
        return "Student [ID: " + studentId + ", Name: " + studentName + ", CGPA: " + studentCGPA + "]";
    }

    public int getStudentId()
    {
        return studentId;
    }
}
