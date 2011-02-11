package com.headexplodes.example.base.part1;

import com.google.common.base.Objects;
import com.google.common.collect.ComparisonChain;
import com.headexplodes.example.Job;


public class Employee implements Comparable<Employee> {

    private String name;
    private Job job;
    private int age;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Employee)) return false;

        Employee that = (Employee) object;
        return Objects.equal(name, that.name)
                && Objects.equal(age, that.age)
                && job == that.job;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name, job, age);
    }

    @Override
    public String toString() {
        return Objects.toStringHelper(this)
                .add("name", name)
                .add("age", age)
                .add("job", job)
                .toString();
    }


    @Override
    public int compareTo(Employee other) {
        return ComparisonChain.start()
                .compare(name, other.name)
                .compare(job, other.job)
                .compare(age, other.age)
                .result();
    }
}
