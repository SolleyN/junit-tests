package test;
import java.util.ArrayList;

public class Student {
    private long id;
    private String name;
    private ArrayList<Integer> grades;

    public Student(String name, long id) {
        this.name = name;
        this.id = id;
        this.grades = new ArrayList<Integer>();
    }

    public long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public void addGrade(int grade) {
        this.grades.add(grade);
    }

    public ArrayList<Integer> getGrades() {
        return this.grades;
    }

    public double getGradeAverage() {
        if (this.grades.isEmpty()) {
            return 0;
        }

        int sum = 0;
        for (int grade : this.grades) {
            sum += grade;
        }
        return (double) sum / this.grades.size();
    }
}
