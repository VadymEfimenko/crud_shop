package ua.com.alevel.books;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Book {

    @Value("Bible")
    private String name;

    @Value("Jesus and other")
    private String author;

    @Value("0")
    private int publicationYear;

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }
}
