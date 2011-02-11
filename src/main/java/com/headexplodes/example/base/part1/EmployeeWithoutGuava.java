package com.headexplodes.example.base.part1;


import com.headexplodes.example.Job;

public class EmployeeWithoutGuava implements Comparable<EmployeeWithoutGuava> {

    private String name;
    private Integer age;
    private Job job;


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

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof EmployeeWithoutGuava)) return false;

        EmployeeWithoutGuava that = (EmployeeWithoutGuava) object;
        return (name == that.name || (name != null && name.equals(that.name)))
                && (age == that.age || (age != null && age.equals(that.age)))
                && job == that.job;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (age != null ? age.hashCode() : 0);
        result = 31 * result + (job != null ? job.hashCode() : 0);
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

    @Override
    public int compareTo(EmployeeWithoutGuava other) {
        int result;

        result = name.compareTo(other.name);
        if (result != 0) return result;

        result = age.compareTo(other.age);
        if (result != 0) return result;

        result = job.compareTo(other.job);

        return result;
    }
}
