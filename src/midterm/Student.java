package midterm;

import java.util.ArrayList;
import java.lang.Integer;

public class Student extends Person {
    private int numCourses;
    private ArrayList<String> courses = new ArrayList<String>();
    private ArrayList<Integer> grades = new ArrayList<Integer>();

    public Student(String name, String address) {
        super(name, address);
    }

    public void addCourseGrade (String course, int grade){
        courses.add(course);
        grades.add(grade);
    }

    public void printGrades(){
        for (int i=0; i<courses.size(); i++ ) {
            System.out.println(courses.get(i) + " ");
        }

        for (int j=0; j<grades.size(); j++ ) {
            System.out.println(grades.get(j) + " ");
        }
    }

    public double getAverageGrade(){
        int sum = 0;
        for (int i=0; i<grades.size(); i++ ) {
            sum += grades.get(i);
        }
        System.out.println("Average Grade: ");
        return sum/grades.size();
    }

    public String toString (){
        return "Student " + getName() + " " + getAddress();
    }

    public static void main(String[] args) {
        Student a = new Student("A", "so 10 hai ba trung");
        a.addCourseGrade("Toan",8);
        a.printGrades();
        Student b = new Student("B", "so 10 chua lang");
        b.addCourseGrade("Van",9);
        b.printGrades();
        Student c = new Student("C", "so 11 chua lang");
        c.addCourseGrade("Sinh",9);
        c.printGrades();

    }

}
