package service;

import model.NameComparator;
import model.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringJoiner;

public class StudentService {
    public  static List<Student> convert(List<String> content){
        List<Student> students = new ArrayList<>();
        for(String s: content){
            students.add(new Student(s));
        }
        return  students;
    }
    public  static  Student maxStudent(List<Student> students){
        return  Collections.max(students);
    }
    public  static  List<Student> sortByName(List<Student> students){
        Collections.sort(students, new NameComparator());
        return  students;
    }
    public  static  String listToString(List<Student> students){
        StringJoiner sj = new StringJoiner(", ");
        for(Student student: students){
            sj.add(student.toString());
        }
        return  sj.toString();
    }
}
