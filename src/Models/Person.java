package Models;

public class Person {
    private String name;
    private String surname;
    private int age;
    private String gender;
    int compareTo(Person other){
        return surname.compareTo(other.surname);
    }

    public Person(String name, String surname, int age, String gender){
        this.name=name;
        this.surname=surname;
        this.age=age;
        this.gender=gender;
    }

    @Override
    public String toString() {
        return "Hi,I am "+name+" "+surname+",a "+age+"-year-old "+ gender;

    }
}
