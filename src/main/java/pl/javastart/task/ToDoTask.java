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
        this(name, description);
        this.priority = priority;
    }

    public ToDoTask(String name, String description, int priority, Person person) {
        this(name, description, priority);
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
        String priority = "średni";
        if (this.lowPriority()) {
            priority = "niski";
        }
        if (this.highPriority()) {
            priority = "wysoki";
        }
        System.out.println(priority);
    }

    void showInfo() {
        System.out.println("Nazwa zadania: " + this.name);
        System.out.println("Opis zadania: " + this.description);
        String priority;
        if (this.lowPriority()) {
            priority = "niski";
        } else if (this.mediumPriority()) {
            priority = "średni";
        } else {
            priority = "wysoki";
        }
        System.out.println("Priorytet: " + priority);
        if (this.person != null) {
            String name = this.person.getPersonName();
            if (name != null) {
                System.out.println("Osoba odpowiedzialna: " + name);
            }
        }
        System.out.println();
    }
}
