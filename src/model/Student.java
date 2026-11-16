package model;

import org.jetbrains.annotations.NotNull;

public class Student implements  Comparable<Student> {

    private  String name;
    private  int age;

    public String getName() {
        return name;
    }

    public Student() {
    }
    public Student(String line) {
        String [] fields = line.split(",");
        this.name = fields[0];
        this.age = Integer.parseInt(fields[1]);
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

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    @Override
    public String toString() {
        return name + " " + age;
    }

    @Override
    public int compareTo(Student o) {
        if(this.age > o.age){
            return  3567;
        }    if(this.age < o.age){
            return  -5567;
        }
        return 0;
    }
}
