package course;

import java.util.ArrayList;
import java.util.HashMap;

public class Course {
    private int id;
    private String title;
    private ArrayList<Homework> homeworks;

    protected Course(int id, String title){
        this.id = id;
        this.title = title;
        homeworks = new ArrayList<>();
    }

    public int getId(){
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setHomework(Homework hw){
        homeworks.add(hw);
    }

    public String getHomeworks(){
        String result = "";

        for(int i = 0; i < homeworks.size(); i++) {
            result += homeworks.get(i).toString();
            result += "\n";
        }

        return result;
    }
}
