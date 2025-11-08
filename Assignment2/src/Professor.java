public class Professor extends Student_Main implements Research{
    private String department;

    public Professor(String name, String department) {
        super(name);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public void research(String researchSubject) {
        System.out.println(getName() + " is doing research on " + researchSubject);
    }

    @Override
    public String toString() {
        return super.toString() + ", Department: " + department;
    }
}