package ua.com.alevel.aspect;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AroundAspect {

    @Around("execution(public String returnBook(ua.com.alevel.books.Book))")
    public Object aroundReturningBookLogAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("AroundAspect.aroundReturningBookLogAdvice we returning book");

        Object targetMethodResult = proceedingJoinPoint.proceed();
        System.out.println("AroundAspect.aroundReturningBookLogAdvice successfully returned book");

        return targetMethodResult;
    }
}
