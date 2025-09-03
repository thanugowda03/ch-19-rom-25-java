package com.xworkz.libraryapp.library;

import com.xworkz.libraryapp.book.Book;


public class Library {
    Book[] books = new Book[14];
    int index;

    public boolean addBook(Book book) {
        boolean isBookAdded = false;
        if (book != null) {
            books[index++] = book;
            isBookAdded = true;
        } else {
            System.out.println("Invalid Book");
        }
        return isBookAdded;
    }
    public void getAllBooks(){
        System.out.println("List of books are "+books.length);
        for (Book book:books){

            System.out.println("Book id: "+book.getBookId());
            System.out.println("Book title: "+book.getTitle());
            System.out.println("Book author: "+book.getAuthor());
        }
    }
}
/*BookDetails bookDetails;
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
        System.out.println("Book auther: "+bookDetails.getAuthor());
        System.out.println("Book publisher: "+bookDetails.getPublisher());
        System.out.println("Book price: "+bookDetails.getPrice());
        System.out.println("Book pages: "+bookDetails.getPages());
        System.out.println("Book publication year: "+bookDetails.getPublicationYear());
    }*/

