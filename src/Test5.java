import model.Student;
import service.FileService;
import service.StudentService;

import java.io.IOException;
import java.util.List;

public class Test5 {
    public static final String URL = "student.txt";
    public static void main(String[] args) {
        try {
            List<String> elements = FileService.readFile(URL);
            List<Student> students = StudentService.convert(elements);
            Student student = StudentService.maxStudent(students);
            List<Student> students1 = StudentService.sortByName(students);
            String s = StudentService.listToString(students1);
            FileService.writeFile(URL, "\nMax Student is: " + student.toString());
            FileService.writeFile(URL, "\nSort by name: " + s);
            System.out.println(s);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
