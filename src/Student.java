import java.util.ArrayList;

public class Student extends Person{
    private static int studentIdGenerator = 1;
    public Student(String name, String surname, int age, String gender){
        super(name, surname, age, gender);
        this.studentId = studentId;
        studentId = studentIdGenerator++;
    }
    private int studentId;
    private ArrayList<Integer> grades = new ArrayList<>();
    public void addGrade(int grade){
        if(grade>=0 && grade<=100)
            grades.add(grade);
    }
    public int calculateGpa(){
        int sum = 0;
        for(int grade : grades){
            sum+=grade;
        }
        return sum/grades.size();
    }
    @Override
    public String toString() {
        return super.toString()+" .I am a student with ID: "+studentId;
    }
}
