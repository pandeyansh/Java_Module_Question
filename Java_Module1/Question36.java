public class Question36 {
    private String name;
    private int rollNumber;
    private double marks;
    public Question36(String name, int rollNumber, double marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }
    public String getName() {
        return name;
    }
    public int getRollNumber() {
        return rollNumber;
    }
    public double getMarks() {
        return marks;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }
    public void setMarks(double marks) {
        this.marks = marks;
    }
    @Override
    public String toString() {
        return "Student Details:\n" +
               "Name: " + name + "\n" +
               "Roll Number: " + rollNumber + "\n" +
               "Marks: " + marks;
    }
    public static void main(String[] args) {   
        Question36 student1 = new Question36("Ansh Pandey", 7, 85.5);
        System.out.println(student1);
        student1.setName("Anubhav Pandey");
        student1.setMarks(92.0);
        System.out.println("\nUpdated Student Information:");
        System.out.println(student1);
    }
}