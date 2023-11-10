package midterm;

import java.util.ArrayList;

public class Teacher extends Person{
    private int numCourses;
    private ArrayList<String> courses = new ArrayList<String>();

    public Teacher(String name, String address) {
        super(name, address);
    }

   /* public boolean addCourse(String course){
        int count = 0;
        for (int i=0; i<courses.size(); i++){
            if (courses.[i] == course) {
                count ++;
            }
        }
        if (count ==0) {
            courses.add(course);
        }
        return true; // đã được add
    }

    public boolean removeCourse (String course){
        for (int i=0; i<courses.size(); i++){
            if (courses.[i] == course) {
                courses.remove(course);
            }
        }
        return true; // đã được xóa
    } */

    public String toString(){
        return "Teacher " + getName() + " " + getAddress();
    }

    public static void main(String[] args) {
        Teacher a = new Teacher("Nguyen van b" , " so 5 bien hoa");
    }
}
