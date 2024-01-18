package Task_3;

import java.util.ArrayList;
import java.util.Arrays;

public class Library implements Menu {

    private Book[] books;

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

    @Override
    public String toString() {
        return "Library{" +
                "books=" + Arrays.toString(books) +
                '}';
    }

    public void addBook(Book[] book) {

        books = new Book[5];
        books = book;


    }

    public void show() {
        for (Book i : this.books) {
            System.out.println(i);
        }
    }


    public void searchBook(int bookID) {
        for (Book i : this.books) {
            if (i.getBookID() == bookID) {
                System.out.println("yes " + bookID + " is found ");
                System.out.println("please check given below for details");
                System.out.println(i);
            }
        }

    }

    @Override
    public void replaceBook(int bookID, String name) {

        for (Book i : this.books) {
            if (i.getBookID() == bookID) {
                i.setTitle(name);
            }
        }

    }
}
