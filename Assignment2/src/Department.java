import java.util.ArrayList;

public class Department {

    private String location;
    private ArrayList<Student> students;
    private ArrayList<Courses> courses;

    public Department(String location) {
        this.location = location;
        this.students = new ArrayList<Student>();
        this.courses = new ArrayList<Courses>();
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudent(Student student) {
        students.remove(student);
    }

    public void addCourse(Courses course) {
        courses.add(course);
    }

    public void removeCourse(Courses course) {
        courses.remove(course);
    }

    @Override
    public String toString() {
        return "Department Location: " + location + ", Number of Students: " + students.size() + ", Number of Courses: " + courses.size();
    }

}