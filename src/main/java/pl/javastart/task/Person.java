package pl.javastart.task;

public class Person {

    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    String getPersonName() {
        boolean fNull = (this.firstName == null);
        boolean lNull = (this.lastName == null);
        if (fNull && lNull) {
            return null;
        }
        if (!fNull) {
            if (!lNull) {
                return (this.firstName + " " + this.lastName);
            } else {
                return this.firstName;
            }
        }
        return this.lastName;
    }
}
