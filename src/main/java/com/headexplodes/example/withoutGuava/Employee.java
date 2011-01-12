package com.headexplodes.example.withoutGuava;


public class Employee {

    private String name;
    private Integer age;
    private Position position;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }
    public void setAge(Integer age) {
        this.age = age;
    }

    public Position getPosition() {
        return position;
    }
    public void setPosition(Position position) {
        this.position = position;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Employee)) return false;

        Employee that = (Employee) object;
        if (age != null ? !age.equals(that.age) : that.age != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (position != that.position) return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (age != null ? age.hashCode() : 0);
        result = 31 * result + (position != null ? position.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(Employee.class.getSimpleName());
        sb.append("{name=").append(name);
        sb.append(", age=").append(age);
        sb.append(", position=").append(position);
        sb.append('}');
        return sb.toString();
    }
}
