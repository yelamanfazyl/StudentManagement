package humanbeings;

import course.Course;
import course.Homework;

import java.util.ArrayList;
import java.util.HashMap;

public class Teacher extends Human {
    private ArrayList<Course> courses;

    public Teacher(String firstName, String surname){
        this.setFirstName(firstName);
        this.setSurname(surname);
        this.courses = new ArrayList<>();
    }

    public boolean addCourse(Course course){
        for(int i = 0; i < courses.size(); i++){
            if(course.getId() == courses.get(i).getId()){
                return false;
            }
        }

        courses.add(course);

        return true;
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }
}
