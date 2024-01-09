package academy.olga.practika3.ums;

import java.util.Objects;

public class Staff extends UniversityMember{
    private String department;
    private String jobTitle;

    public Staff(){

    }

    public Staff(String department, String jobTitle) {
        this.department = department;
        this.jobTitle = jobTitle;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "department='" + department + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Staff staff = (Staff) o;
        return Objects.equals(department, staff.department) && Objects.equals(jobTitle, staff.jobTitle);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), department, jobTitle);
    }
}
