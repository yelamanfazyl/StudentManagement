package humanbeings;

public abstract class Human {
    private String firstName;
    private String surname;

    public String getFirstName(){
        return firstName;
    }

    public String getSurname() {
        return surname;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
