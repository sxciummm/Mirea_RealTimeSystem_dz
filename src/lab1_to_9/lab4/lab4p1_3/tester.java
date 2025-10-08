package lab1_to_9.lab4.lab4p1_3;

public class tester {
    public static void main(String[] args) {

        Person person1 = new Person();
        Person person2 = new Person("Антон", 12);

        person1.talk();
        person2.move();

        System.out.println("Его зовут - " + person2.getFullName() + ", ему " + person2.getAge() + " лет");

    }
}
