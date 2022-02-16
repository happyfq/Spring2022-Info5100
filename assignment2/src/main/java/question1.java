public class question1 {
    public static void main(String[] args) {
        Student student1 = new Student(101, "ABC");
        System.out.println(" Roll number of the first student: " +
                student1.printRoll());
        System.out.println(" Name of the first student: " + student1.printName());
        Student student2 = new Student(student1);
        System.out.println(" Roll number of the second student: " +
                student2.printRoll());
        System.out.println(" Name of the second student: " + student2.printName());
    }
}

class Student {
    int rollNumber;
    String name;

    public Student(int rollNumber, String name) {
        this.rollNumber = rollNumber;
        this.name = name;
    }

    public Student(Student student) {
        this.rollNumber = student.rollNumber;
        this.name = student.name;
    }

    public int printRoll() {
        return rollNumber;
    }

    public String printName() {
        return name;
    }
}