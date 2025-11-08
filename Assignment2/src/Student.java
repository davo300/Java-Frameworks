import java.util.ArrayList;

public class Student extends Student_Main {

    private String id;
    protected ArrayList<String> courses;

    public Student(String name, String id) {
        super(name);
        this.id = id;
        this.courses = new ArrayList<String>();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void addCourse(String course) {
        courses.add(course);
    }

    public void deleteCourse(String course) {
        courses.remove(course);
    }

    public void printCourses() {
        System.out.println("Courses taken by " + getName() + ": ");
        for (String course : courses) {
            System.out.println(course);
        }
    }
    
    public String getName() {
    	return name;
    }

    @Override
    public String toString() {
        return super.toString() + ", ID: " + id;
    }

}