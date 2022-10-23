package ua.com.alevel.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import ua.com.alevel.books.Book;

@Component
@Aspect
@Order(1)
public class LoggingAspect {

    @Pointcut("execution(* ua.com.alevel.books.*.add*(..))")
    public void beforeGettingBookLog() {
    }

    @Before("beforeGettingBookLog()")
    public void beforeGettingBookAdvice(JoinPoint joinPoint) {
        System.out.println("try get/buy a book logging");
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        System.out.println("methodSignature: " + methodSignature);
        System.out.println("methodSignature.getMethod(): " + methodSignature.getMethod());
        System.out.println("methodSignature.getReturnType(): " + methodSignature.getReturnType());
        System.out.println("methodSignature.getName(): " + methodSignature.getName());

        if (methodSignature.getName().startsWith("add")) {
            Object[] args = joinPoint.getArgs();
            for (Object obj : args) {
                if (obj instanceof Book) {
                    Book book = (Book) obj;
                    System.out.println("Book information: " + book.getAuthor() + " " + book.getName());
                }
                if (obj instanceof String) {
                    String person = (String) obj;
                    System.out.println("Person information: " + person );
                }
            }
        }
    }
}
