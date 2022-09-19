package course;

public class Homework {
    private String name;
    private String dueDate;

    public Homework(String name, String dueDate){
        this.name = name;
        this.dueDate = dueDate;
    }

    @Override
    public String toString() {
        return "Homework: " + name + ". Due date: " + dueDate;
    }
}
