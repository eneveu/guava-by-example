package com.headexplodes.example.withGuava;


import com.google.common.base.Objects;
import com.google.common.collect.ComparisonChain;

public class Person implements Comparable<Person> {

    private String name;

    private int age;

    private Position position;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;

        if (!(other instanceof Person)) return false;

        Person person = (Person) other;

        return age == person.age
                && Objects.equal(name, person.name)
                && Objects.equal(position, person.position);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(age, name, position);
    }

    public int compareTo(Person o) {
        return ComparisonChain.start().compare(position, o.position)
                .compare(age, o.age)
                .compare(name, o.name)
                .result();
    }
}
