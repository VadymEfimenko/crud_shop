package ua.com.alevel;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Component
public class University {

    private List<Student> students = new ArrayList<>();

    public void addStudent() {
        Student student1 = new Student("Ivan", 2, 4.1);
        Student student2 = new Student("Fedya", 2, 7.1);
        Student student3 = new Student("Sergei", 2, 9.1);
        students.add(student1);
        students.add(student2);
        students.add(student3);
    }

    public List<Student> getStudents(){
        System.out.println("wait a sec");
        System.out.println("information");
        System.out.println(students);
        System.out.println(students.get(3)); //throwing exception to show how @AfterThrowing works
        return students;
    }
}
