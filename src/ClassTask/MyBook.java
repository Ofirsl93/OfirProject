package ClassTask;

import java.util.ArrayList;
import java.util.List;

public class MyBook {
    public static void main(String[] args) {
        List<Book> booksList = new ArrayList<>();

        Book book1 = new Book();
        book1.setName("The Catcher in the Rye");
        book1.setPrice(12.99);
        book1.setPagesAmount(224);

        Book book2 = new Book();
        book2.setName("To Kill a Mockingbird");
        book2.setPrice(15.50);
        book2.setPagesAmount(336);

        Book book3 = new Book();
        book3.setName("1984");
        book3.setPrice(9.99);
        book3.setPagesAmount(328);

        booksList.add(book1);
        booksList.add(book2);
        booksList.add(book3);

        printBookInformation(booksList);
    }

    public static void printBookInformation(List<Book> books) {
        for (Book book : books) {
            System.out.println("Book Information:");
            System.out.println("Title: " + book.getName());
            System.out.println("Price: $" + book.getPrice());
            System.out.println("Page Amount: " + book.getPagesAmount());
            System.out.println();
        }
    }
}