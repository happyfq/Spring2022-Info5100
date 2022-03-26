public class question1{
    public static void main(String[] args) {
        Student s1 = new Student("John",000,95);
//This is shallow copy. s1 and s2 have the same memory location, s1 will be changed when s2 changes
        Student s2 = s1;
        s2.setGpa(90);
        System.out.println(s1.getGpa());
        System.out.println(s2.getGpa());
// //This is Deep copy. s1 and s3 have different memory locations,s1 will not be changed even though s3 changes
        Student s3 = new Student(s1);
        s3.setName("Tom");
        System.out.println(s1.getName());
        System.out.println(s3.getName());
    }
}
class Student{
    String name;
    int studentID;
    int gpa;

    public Student(String name, int studentID, int gpa) {
        this.name = name;
        this.studentID = studentID;
        this.gpa = gpa;
    }
    public Student(Student student){
        this.name =student.name;
        this.studentID=student.studentID;
        this.gpa = student.gpa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public int getGpa() {
        return gpa;
    }

    public void setGpa(int gpa) {
        this.gpa = gpa;
    }
}