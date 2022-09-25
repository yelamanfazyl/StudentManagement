import course.Course;
import course.CourseList;
import course.Homework;
import database.Driver;
import humanbeings.Student;
import humanbeings.Teacher;

import java.sql.SQLException;
import java.util.ArrayList;

public class Main {
    public static void main(String args[]) {
        String query = "select count(*) from students";
        Driver driver = new Driver();

        try{
            System.out.println(driver.makeQuery(query));
        } catch(SQLException se){
            System.out.println(se);
        }

    }
}
