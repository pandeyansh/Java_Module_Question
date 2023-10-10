class Student {
    private String name;
    private int age;
    private double grade;
    public Student(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Invalid age. Age must be non-negative.");
        }
    }
    public double getGrade() {
        return grade;
    }
    public void setGrade(double grade) {
        if (grade >= 0 && grade <= 100) {
            this.grade = grade;
        } else {
            System.out.println("Invalid grade. Grade must be between 0 and 100.");
        }
    }
    public void displayStudentInfo() {
        System.out.println("Student Information:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
    }
}
public class Question40 {
    public static void main(String[] args) {       
        Student student1 = new Student("Ansh Pandey", 22, 90.5);
        student1.displayStudentInfo();
        student1.setName("Anubhav Pandey");
        student1.setAge(23);
        student1.setGrade(95.5);
        System.out.println("\nUpdated Student Information:");
        student1.displayStudentInfo();
    }
}