package ua.com.alevel;

import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class AdvicesTypesMain {

    public static void main(String[] args) {
        SpringApplication.run(SpringAopApplication.class, args);

        AnnotationConfigApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(MyConfig.class);

        University university = applicationContext.getBean("university", University.class);
        university.addStudent();
        try {
            List<Student> students = university.getStudents();
        } catch (Exception e) {
            System.out.println("exception info in @AfterThrowing message");
        }
        applicationContext.close();
    }
}
