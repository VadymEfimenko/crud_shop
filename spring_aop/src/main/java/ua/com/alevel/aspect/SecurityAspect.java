package ua.com.alevel.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(2)
public class SecurityAspect {

    @Pointcut("execution(* ua.com.alevel.books.*.add*(..))")
    public void beforeGettingBookSecurityCheck() {
    }

    @Before("beforeGettingBookSecurityCheck()")
    public void beforeGettingBookSecurityCheckAdvice(JoinPoint joinPoint) {
        System.out.println("SecurityCheck before get/buy book");

    }
}
