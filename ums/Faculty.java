package academy.olga.practika3.ums;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Faculty extends UniversityMember implements Research{
    String department = null;
    List<Object> coursesTeaching = new ArrayList<>();

    public Faculty(){

    }

    public Faculty(String department, List<Object> coursesTeaching) {
        this.department = department;
        this.coursesTeaching = coursesTeaching;
    }

    public void assignCourse(String courseName){
        coursesTeaching.add(courseName);
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public List<Object> getCoursesTeaching() {
        return coursesTeaching;
    }

    public void setCoursesTeaching(List<Object> coursesTeaching) {
        this.coursesTeaching = coursesTeaching;
    }

    @Override
    public void conductResearch() {
        System.out.println("Faculty metod");
    }

    @Override
    public String toString() {
        return "Faculty{" +
                "department='" + department + '\'' +
                ", coursesTeaching=" + coursesTeaching +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Faculty faculty = (Faculty) o;
        return Objects.equals(department, faculty.department) && Objects.equals(coursesTeaching, faculty.coursesTeaching);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), department, coursesTeaching);
    }
}
