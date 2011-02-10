package com.headexplodes.example.base.part1;


import com.headexplodes.example.Job;

public class EmployeeWithoutGuava {

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
        if (!(object instanceof EmployeeWithoutGuava)) return false;

        // TODO better equals method
        EmployeeWithoutGuava that = (EmployeeWithoutGuava) object;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (job != that.job) return false;
        return age == that.age;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (job != null ? job.hashCode() : 0);
        result = 31 * result + (age);
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(EmployeeWithoutGuava.class.getSimpleName());
        sb.append("{name=").append(name);
        sb.append(", age=").append(age);
        sb.append(", job=").append(job);
        sb.append('}');
        return sb.toString();
    }
}
