import course.Course;
import course.CourseList;
import course.Homework;
import humanbeings.Student;
import humanbeings.Teacher;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        CourseList registrar = new CourseList();
        registrar.addCourse("csci151");
        registrar.addCourse("csci152");
        registrar.addCourse("math161");
        registrar.addCourse("phys162");

        Teacher hansDeNeville = new Teacher("Hans", "De Neville");
        hansDeNeville.addCourse(registrar.getCourse(0));
        hansDeNeville.addCourse(registrar.getCourse(1));

        ArrayList<Course> hansCourses = hansDeNeville.getCourses();

        for(int i = 0; i < hansCourses.size(); i++){
            Homework hw1 = new Homework("Assignment 1", "25-09-2022");
            Homework hw2 = new Homework("Assignment 2", "31-09-2022");
            hansCourses.get(i).setHomework(hw1);
            hansCourses.get(i).setHomework(hw2);
        }

        Student Yelaman = new Student("Yelaman", "Fazyl");
        Yelaman.addCourse(registrar.getCourse(0));
        Yelaman.addCourse(registrar.getCourse(1));
        Yelaman.addCourse(registrar.getCourse(2));
        Yelaman.addCourse(registrar.getCourse(3));

        System.out.println(Yelaman.getHomeworks());
    }
}
