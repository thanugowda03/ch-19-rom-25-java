package com.xworkz.libraryapp.validator;


import com.xworkz.libraryapp.book.Book;

public class BookValidator {

    Book book;
    public boolean validateBookInfo(Book book){
        boolean validateBook = false;
        boolean bookIdValid = false;
        boolean titleValid = false;
        boolean autherValid = false;
        /*boolean publisherValid = false;
        boolean priceValid = false;
        boolean pagesValid = false;
        boolean publicationYearValid = false;*/

        if (book.getBookId() > 0 ){
            bookIdValid = true;
        }
        else {
            System.out.println("Book id is not valid");
        }
        if (book.getTitle() != null && !book.getTitle().isEmpty()){
            titleValid = true;
        }
        else {
            System.out.println("Book title is empty/null");
        }
        if (book.getAuthor() != null && !book.getAuthor().isEmpty()){
            autherValid = true;
        }
        else {
            System.out.println("Book Auther is empty/null");
        }
        /*
        if (book.getPublisher() != null && !book.getPublisher().isEmpty()){
            publisherValid = true;
        }
        else{
            System.out.println("Publisher is empty/null");
        }
        if (bookDetails.getPrice() > 0){
            priceValid = true;
        }
        else {
            System.out.println("Price is not valid");
        }
        if(bookDetails.getPages() > 0){
            pagesValid = true;
        }
        else {
            System.out.println("Pages is not valid");
        }
        if (bookDetails.getPublicationYear() > 0){
            publicationYearValid = true;
        }
        else {
            System.out.println("Publication year is not valid");
        }*/
        if(bookIdValid && titleValid && autherValid ){//&& publisherValid && priceValid && pagesValid && publicationYearValid){
            validateBook = true;
        }
        return validateBook;
    }
}
