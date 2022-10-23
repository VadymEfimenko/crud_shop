package ua.com.alevel.books;

import org.springframework.stereotype.Component;

@Component
public class Store {

    public void buyBook(){
        System.out.println("book is bought from store");
    }

    public void addToShoppingCart(String personName, Book book){
        System.out.println("the book has been added to the cart " + personName + " " + book.getName());
    }
}
