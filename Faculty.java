package Problem_two;

public class Faculty {
    private int facultyId;
    private String facultyName;
    private String facultyPosition;

    public Faculty() {

    }

    public Faculty(int facultyId,String facultyName,String facultyPosition)
    {
        this.facultyId = facultyId;
        this.facultyName = facultyName;
        this.facultyPosition = facultyPosition;
    }
    @Override
    public String toString()
    {
        return "Faculty [ID: " + facultyId + ", Name: " + facultyName + ", Position: " + facultyPosition + "]";
    }

}
