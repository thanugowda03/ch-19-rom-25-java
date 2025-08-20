package com.xworkz.libraryapp.library;

import com.xworkz.libraryapp.book.BookDetails;
import com.xworkz.libraryapp.validator.BookValidator;

public class Library {

BookDetails bookDetails;
    public boolean addBookDetails(BookDetails bookDetails){
        boolean isBookAdded = false;
        boolean isBookInfoValid = false;

        BookValidator bookValidator = new BookValidator();

        isBookInfoValid = bookValidator.validateBookInfo(bookDetails);

        if (isBookInfoValid){
            this.bookDetails = bookDetails;
            isBookAdded = true;
        }
        return isBookAdded;
    }
    public void getBookInfo(){
        System.out.println("Book id: "+bookDetails.getBookId());
        System.out.println("Book title: "+bookDetails.getTitle());
        System.out.println("Book auther: "+bookDetails.getAuther());
        System.out.println("Book publisher: "+bookDetails.getPublisher());
        System.out.println("Book price: "+bookDetails.getPrice());
        System.out.println("Book pages: "+bookDetails.getPages());
        System.out.println("Book publication year: "+bookDetails.getPublicationYear());
    }
}
