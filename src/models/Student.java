package models;

import java.util.ArrayList;

public class Student extends Person{
    private static int studentIdGenerator = 1;
    public Student(String name, String surname, int age, String gender){
        super(name, surname, age, gender);
        studentId = studentIdGenerator++;
    }
    private int studentId;
    private ArrayList<Integer> grades = new ArrayList<>();
    public void addGrade(int grade){
        if(grade>=0 && grade<=100)
            grades.add(grade);
    }
    public double calculateGpa(){
        double sum = 0;
        for(int grade : grades){
            sum+=grade;
        }
        return sum/grades.size()*0.04;
    }
    @Override
    public String toString() {
        return super.toString()+" .I am a student with ID: "+studentId;
    }
}
