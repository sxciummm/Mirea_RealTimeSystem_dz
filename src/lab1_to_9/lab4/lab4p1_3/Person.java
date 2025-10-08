package lab1_to_9.lab4.lab4p1_3;

public class Person {
    private String fullName;
    private int age;

    public Person(String fullName, int age) {
        this.age = age;
        this.fullName = fullName;
    }

    public Person() {
        this("NoName", 0);
    }

    public String getFullName() {return fullName;}
    public int getAge() {return age;}
    public void setAge(int age) {this.age = age;}
    public void setFullName(String fullName) {this.fullName = fullName;}

    public void move() {
        System.out.println(fullName + " двигается");
    }

    public void talk() {
        System.out.println(fullName + " говорит");
    }

}
