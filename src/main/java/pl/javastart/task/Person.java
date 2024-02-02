package pl.javastart.task;

public class Person {

    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    String getPersonName() {
        if (this.firstName != null && this.lastName != null) {
            return (this.firstName + " " + this.lastName);
        } else if (this.firstName != null) {
            return this.firstName;
        } else if (this.lastName != null) {
            return this.lastName;
        } else {
            return null;
        }
    }
}
