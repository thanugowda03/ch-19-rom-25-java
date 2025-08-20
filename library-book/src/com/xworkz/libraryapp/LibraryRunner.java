package com.xworkz.libraryapp;

import com.xworkz.libraryapp.book.BookDetails;
import com.xworkz.libraryapp.library.Library;

public class LibraryRunner {

    public static void main(String[] args) {

        System.out.println("main started");
        BookDetails bookDetails = new BookDetails();
        bookDetails.setBookId(1);
        bookDetails.setTitle("Wings of Fire");
        bookDetails.setAuther("A.P.J. Abdul Kalam");
        bookDetails.setPublisher("Universities page");
        bookDetails.setPrice(350.00);
        bookDetails.setPages(180);
        bookDetails.setPublicationYear(1999);

        Library library = new Library();
        boolean bookAdded = library.addBookDetails(bookDetails);
        if (bookAdded){
        library.getBookInfo();
        }else{
            System.out.println("Application is not added");
        }
    }
}
