public class quiz {
    public static void main(String[] args) {

    }
}
class Person{
    String name;
    int Id;
    int age;

    public Person() {
    }

    public Person(String name, int id, int age) {
        this.name = name;
        Id = id;
        this.age = age;
    }
}

class Professor extends Person{
    String quiz;
    public Professor() {
    }

    public Professor(String name, int id, int age) {
        super(name, id, age);
    }
    public void giveQuiz(String quiz){
        System.out.println("Professor gives quiz: "+quiz);
    }
}

class Student extends Person{
    String quiz;
    public Student() {
    }

    public Student(String name, int id, int age) {
        super(name, id, age);
    }
    public void takeQuiz(String quiz){
        System.out.println("Student takes quiz: "+quiz);
    }
}