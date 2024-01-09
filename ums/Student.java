package academy.olga.practika3.ums;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Student extends UniversityMember implements Research{
    private int gpa;
    private List<Object> courses = new ArrayList<>();

    public Student(){

    }

    public Student(int gpa, List<Object> courses) {
        this.gpa = gpa;
        this.courses = courses;
    }

    public void assignCourse(String courseName){
        courses.add(courseName);
    }

    @Override
    public void conductResearch() {
        System.out.println("Student metod");
    }

    public int getGpa() {
        return gpa;
    }

    public void setGpa(int gpa) {
        this.gpa = gpa;
    }

    public List<Object> getCourses() {
        return courses;
    }

    public void setCourses(List<Object> courses) {
        this.courses = courses;
    }

    @Override
    public String toString() {
        return "Student{" +
                "gpa=" + gpa +
                ", courses=" + courses +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Student student = (Student) o;
        return gpa == student.gpa && Objects.equals(courses, student.courses);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), gpa, courses);
    }
}
