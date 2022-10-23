package ua.com.alevel;

import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ua.com.alevel.books.Book;
import ua.com.alevel.books.Library;
import ua.com.alevel.books.Store;


public class SpringAopApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringAopApplication.class, args);

        AnnotationConfigApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(MyConfig.class);

        Library library = applicationContext.getBean("library", Library.class);
        Store store = applicationContext.getBean("store", Store.class);
        Book book = applicationContext.getBean("book", Book.class);
        library.addBook("fedya", book);
        store.addToShoppingCart("maria", book);

        applicationContext.close();
    }

}
