package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        Person person1 = new Person(null, null);
        Person person2 = new Person("Adam", null);
        Person person3 = new Person(null, "Nowak");
        Person person4 = new Person("Anna", "Kowalska");
        ToDoTask toDoTask1 = new ToDoTask("Odkurzanie", "ciężka robota");
        ToDoTask toDoTask2 = new ToDoTask("Zamiatanie", "wszystkich pokoi", 2);
        ToDoTask toDoTask3 = new ToDoTask("Malowanie", "kuchnia", 4, person1);
        ToDoTask toDoTask4 = new ToDoTask("Malowanie", "przedpokój", 3, person2);
        ToDoTask toDoTask5 = new ToDoTask("Malowanie", "salon", 5, person3);
        ToDoTask toDoTask6 = new ToDoTask("Prasowanie", "koszule", -1, person4);
        toDoTask1.showInfo();
        toDoTask2.showInfo();
        toDoTask3.showInfo();
        toDoTask4.showInfo();
        toDoTask5.showInfo();
        toDoTask6.showInfo();
        toDoTask1.showTaskPriority();
        toDoTask2.showTaskPriority();
        toDoTask3.showTaskPriority();
        toDoTask4.showTaskPriority();
        toDoTask5.showTaskPriority();
        toDoTask6.showTaskPriority();
    }
}
