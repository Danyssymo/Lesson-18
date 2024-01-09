package academy.olga.practika3.ums;

import java.util.Objects;

public abstract class UniversityMember {
    private String name;
    private int id;
    private String email;

    public void getMemberInfo() {
        System.out.println(getName() + " " + getId() + " " + getEmail());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UniversityMember that = (UniversityMember) o;
        return id == that.id && Objects.equals(name, that.name) && Objects.equals(email, that.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id, email);
    }

}
