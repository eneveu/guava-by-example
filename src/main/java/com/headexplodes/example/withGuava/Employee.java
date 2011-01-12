package com.headexplodes.example.withGuava;


import com.google.common.base.Objects;
import com.google.common.collect.ComparisonChain;

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
        return Objects.equal(name, that.name)
                && Objects.equal(age, that.age)
                && Objects.equal(position, that.position);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name, age, position);
    }

    @Override
    public String toString() {
        return Objects.toStringHelper(this)
                .add("name", name)
                .add("age", age)
                .add("position", position)
                .toString();
    }
}
