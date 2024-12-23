public class Teacher extends Person{
    private String subject;
    private int yearsOfExperience;
    private int salary;

    public int getSalary() {
        return salary;
    }

    public Teacher(String name, String surname, int age, String gender, String subject, int yearsOfExperience, int salary) {
        super(name,surname,age,gender);
        this.subject = subject;
        this.yearsOfExperience = yearsOfExperience;
        this.salary = salary;
        if(yearsOfExperience > 10)
            giveRaise(10);
    }
    public void giveRaise(double persentage){
        salary += salary*persentage*0.01;
    }

    @Override
    public String toString() {
        return super.toString()+".I teach "+subject;
    }
}
