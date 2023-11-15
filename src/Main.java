import com.workintech.classes.Person;
import com.workintech.classes.Wall;

public class Main {
    public static void main(String[] args) {


        System.out.println("Wall Tests---------------------------------");
        Wall wall = new Wall(5,4);
        System.out.println("area= " + wall.getArea());
        wall.setHeight(-1.5);
        System.out.println("width= " + wall.getWidth());
        System.out.println("height= " + wall.getHeight());
        System.out.println("area= " + wall.getArea());
        System.out.println("-------------------------------------------");

        System.out.println("Person Tests---------------------------------");
        Person person = new Person("John", "Doe", 20);
        Person person2 = new Person("name2", "lastname2", 19, 35, "email@email.com","+1235342265");

        System.out.println(person2);
        System.out.println("person2.isTeen() => "+ person2.isTeen());

        System.out.println("person Firstname: " + person.getFirstName());
        System.out.println("person LastName: " + person.getLastName());
        System.out.println("person Age: " + person.getAge());
        System.out.println("person.isTeen() => "+ person.isTeen());



        System.out.println("-------------------------------------------");
    }
}