package course;

import java.util.ArrayList;

public class CourseList {
    private ArrayList<Course> courseList;

    public CourseList(){
        courseList = new ArrayList<>();
    }

    public boolean addCourse(String title){
        if(title.length() == 0){
            return false;
        }

        int newId = courseList.size();

        Course course = new Course(newId, title);

        courseList.add(course);

        return true;
    }

    public Course getCourse(int id){
        return courseList.get(id);
    }
}
