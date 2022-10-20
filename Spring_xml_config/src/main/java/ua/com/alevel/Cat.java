package ua.com.alevel;

import org.springframework.stereotype.Component;

@Component
public class Cat implements Pet {
    @Override
    public void say() {
        System.out.println("IM CAT");
    }

    public Cat() {
        System.out.println("created");
    }

    public void init(){
        System.out.println("Cat init method");
    }

    public void destroy(){
        System.out.println("Cat destroy method");
    }
}
