package ua.com.alevel.books;

import org.springframework.stereotype.Component;

@Component
public class Library {

    public void getBook (){
        System.out.println("book is taken from lib ");
    }

    public String returnBook(Book book){
        System.out.println("thanks for returning " + book.getName());
        return book.getName();
    }

    public void addBook(String personName, Book book ){
        System.out.println("thanks for adding " + book.getName() + " by " + book.getAuthor());
    }
}
