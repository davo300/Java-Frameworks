import java.util.ArrayList;

public class Student_Main {

   public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();//array list of students
        students.add(new Graduate("Joe Smith", "12345", "phd"));//new graduate student
        students.add(new Undergraduate("Garion DeJonge", "0766668", true));//undergrad team member 1 
        students.add(new Undergraduate("Matt Davies", "0782597", true));//undergrad team member 2 
        students.add(new Undergraduate("Jaida Mendez", "0698734", true));//undergrad team member 3 
        students.add(new Undergraduate("Tyler Luu", "0763403", true));//undergrad team member 4

        for (int i = 0; i < students.size(); i++) {//for loop to add courses to each team member
        	if (students.get(i) instanceof Undergraduate) {
            students.get(i).addCourse("COIS 2240");//add course 2240 to student at index
            students.get(i).addCourse("COIS 1020");//add course 1020 to student at index
        	}
        }//end of for

        for (int i = 0; i < students.size(); i++) {//for loop to print out the names of all students including courses under condition
            System.out.println(" Student " + i + ":" + " " + students.get(i).getName());//print name using the getName() method
            if (students.get(i) instanceof Undergraduate) {//if student is undergraduate
                System.out.println("\t Courses: " + ((Undergraduate) students.get(i)).getCourses());//print courses of undergrad
                 }//end of if
            if (students.get(i) instanceof Graduate) {//if student is undergraduate
            
            } // nothing to print for graduate
            
        }//end of for

    }//end of main

    //private instance variable name
    protected String name;


    public Student_Main(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Name: " + name;
    }   
}
