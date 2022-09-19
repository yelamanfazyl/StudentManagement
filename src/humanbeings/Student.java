package humanbeings;

import course.Course;

import java.util.ArrayList;

public class Student extends Human {
    private ArrayList<Course> courses;

    public Student(String firstName, String surname){
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

    public String getHomeworks(){
        String result = "";

        for(int i = 0; i < courses.size(); i++) {
            result = result + courses.get(i).getTitle() + ":\n";
            result = result + courses.get(i).getHomeworks();
            result = result + "\n-------------------------------\n";
        }

        return result;
    }
}
