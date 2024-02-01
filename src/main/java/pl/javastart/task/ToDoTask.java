package pl.javastart.task;

public class ToDoTask {

    private String name;
    private String description;
    private int priority;
    private Person person;

    public ToDoTask(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public ToDoTask(String name, String description, int priority) {
        this.name = name;
        this.description = description;
        this.priority = priority;
    }

    public ToDoTask(String name, String description, int priority, Person person) {
        this.name = name;
        this.description = description;
        this.priority = priority;
        this.person = person;
    }

    boolean highPriority() {
        return (this.priority > 0);
    }

    boolean mediumPriority() {
        return (this.priority == 0);
    }

    boolean lowPriority() {
        return (this.priority < 0);
    }

    void showTaskPriority() {
        System.out.print("Zadanie " + this.name + " ma priorytet ");
        String p = "średni";
        if (this.lowPriority()) { p = "niski"; }
        if (this.highPriority()) { p = "wysoki"; }
        System.out.println(p);
    }

    void showInfo() {
        System.out.println("Nazwa zadania: " + this.name);
        System.out.println("Opis zadania: " + this.description);
        String p;
        if (this.lowPriority()) {
            p = "niski";
        } else if (this.mediumPriority()) {
            p = "średni";
        } else {
            p = "wysoki";
        }
        System.out.println("Priorytet: " + p);
        if (this.person != null) {
            String name = this.person.getPersonName();
            if (name != null) {
                System.out.println("Osoba odpowiedzialna: " + name);
            }
        }
        System.out.println();
    }
}
