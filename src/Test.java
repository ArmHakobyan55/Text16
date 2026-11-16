import model.NameComparator;
import model.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Test {
    public static void main(String[] args) {

    List<Student> students = new ArrayList<>();
    List<String> names = new ArrayList<>();
    List<Integer> ages = new ArrayList<>();

        students.add(new Student("Anna", 32));
        students.add(new Student("Karen", 22));
        students.add(new Student("Arman", 26));
        students.add(new Student("Anahit", 18));
        students.add(new Student("Murad", 43));
        students.add(new Student("Jor", 12));
//        for(Student student: students){
//            names.add(student.getName());
//            ages.add(student.getAge());
//        }
        System.out.println(students);

//        Student max = students.getFirst();
//        for(Student student: students) {
//            if(student.getAge() > max.getAge()){
//                max = student;
//            }
//       }
//        System.out.println(max);
        Student max1 = Collections.max(students);
        System.out.println(max1);
        Collections.sort(students, new NameComparator());
        System.out.println(students);
    }
}
