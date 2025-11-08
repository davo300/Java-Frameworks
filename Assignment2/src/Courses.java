public class Courses {
    private String id;
    private Professor professor;

    public Courses(String id, Professor professor) {
        this.id = id;
        this.professor = professor;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    @Override
    public String toString() {
        return "Course ID: " + id + ", Professor: " + professor.getName();
    }
}