package ua.com.alevel.aspect;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;
import ua.com.alevel.Student;

import java.util.List;

@Component
@Aspect
public class UniversityLoggingAspect {

    @Before("execution(* getStudents())")
    public void beforeGetStudentsLoggingAdvice() {
        System.out.println("UniversityLoggingAspect.beforeGetStudentsLoggingAdvice get students ");
    }

    @AfterReturning(pointcut = "execution(* getStudents())",
            returning = "students")
    public void afterReturningGetStudentsLoggingAdvice(List<Student> students) {
        Student firstStudent = students.get(0);
        firstStudent.setName("Mr " + firstStudent.getName());
        firstStudent.setAvgGrade(firstStudent.getAvgGrade() + 1);
        System.out.println("UniversityLoggingAspect.afterReturningGetStudentsLoggingAdvice get students");
    }

    @AfterThrowing(value = "execution(* getStudents())",
    throwing = "exception")
    public void afterThrowingGetStudentAdvice(Throwable exception) {
        System.out.println("UniversityLoggingAspect.afterThrowingGetStudentAdvice something wrong -> " + exception);
    }

    @After("execution(* getStudents())")
    public void afterFinallyGetStudentAdvice() {
        System.out.println("UniversityLoggingAspect.afterFinallyGetStudentAdvice");
    }


}
