package service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class FileService {
    public  static List<String> readFile (String fileName) throws IOException {
       return  Files.readAllLines(Paths.get(fileName));
    }
    public  static  Path writeFile(String fileName, String content) throws IOException {
       return  Files.write(Paths.get(fileName), content.getBytes(), StandardOpenOption.APPEND);
    }

}
