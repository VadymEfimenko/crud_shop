package ua.com.alevel;

import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ua.com.alevel.books.Book;
import ua.com.alevel.books.Library;

public class AroundAdviceMain {

    public static void main(String[] args) {
        SpringApplication.run(SpringAopApplication.class, args);

        AnnotationConfigApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(MyConfig.class);

        Book book = applicationContext.getBean("book", Book.class);
        Library library = applicationContext.getBean("library", Library.class);
        String methodResult = library.returnBook(book);
        System.out.println(methodResult);

        applicationContext.close();
    }
}
