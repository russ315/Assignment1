package models;

public class Person {
    private String name;
    private String surname;
    private int age;
    private boolean gender;
    int compareTo(Person other){
        return surname.compareTo(other.surname);
    }

    public Person(String name, String surname, int age, String gender) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        setGender(gender);
    }

    private void setGender(String gender) {
        if(gender.toLowerCase() == "male")
            this.gender = true;
        else
            this.gender = false;
    }


    @Override
    public String toString() {
        String genderStr = gender ? "male" : "female";
        return "Hi,I am "+name+" "+surname+",a "+age+"-year-old "+ genderStr;

    }
}
