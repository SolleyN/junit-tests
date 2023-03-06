package test;

public class StudentTest {

    public static void main(String[] args) {
        Student student = new Student("Nick");
        student.addGrade(56.3);
        student.addGrade(34.7);
        student.addGrade(36.9);
        System.out.println(student.getName() + "'s average grade is " + student.getGradeAverage());
    }
}
