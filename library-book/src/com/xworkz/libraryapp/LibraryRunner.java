package com.xworkz.libraryapp;

import com.xworkz.libraryapp.book.Book;
import com.xworkz.libraryapp.library.Library;


public class LibraryRunner {

    public static void main(String[] args) {

        System.out.println("main started");
        Book book1 = new Book();
        book1.setBookId(1);
        book1.setTitle("Wings of Fire");
        book1.setAuthor("A.P.J. Abdul Kalam");

        Book book2=new Book();
        book2.setBookId(2);
        book2.setTitle("Midnight's Children");
        book2.setAuthor("Salman Rushdie");

        Book book3=new Book();
        book3.setBookId(3);
        book3.setTitle("The God of Small Things");
        book3.setAuthor("Arundati Ray");

        Book book4=new Book();
        book4.setBookId(4);
        book4.setTitle("A Suitable boy");
        book4.setAuthor("Vikram Seth");

        Book book5=new Book();
        book5.setBookId(5);
        book5.setTitle("The guide");
        book5.setAuthor("R K Narayan");

        Book book6 = new Book();
        book6.setBookId(6);
        book6.setTitle("Wings of Fire");
        book6.setAuthor("A.P.J. Abdul Kalam");

        Book book7 = new Book();
        book7.setBookId(7);
        book7.setTitle("Wings of Fire");
        book7.setAuthor("A.P.J. Abdul Kalam");

        Book book8 = new Book();
        book8.setBookId(8);
        book8.setTitle("Wings of Fire");
        book8.setAuthor("A.P.J. Abdul Kalam");

        Book book9 = new Book();
        book9.setBookId(9);
        book9.setTitle("Wings of Fire");
        book9.setAuthor("A.P.J. Abdul Kalam");

        Book book10 = new Book();
        book10.setBookId(10);
        book10.setTitle("Wings of Fire");
        book10.setAuthor("A.P.J. Abdul Kalam");

        Book book11 = new Book();
        book11.setBookId(11);
        book11.setTitle("Wings of Fire");
        book11.setAuthor("A.P.J. Abdul Kalam");

        Book book12 = new Book();
        book12.setBookId(12);
        book12.setTitle("Wings of Fire");
        book12.setAuthor("A.P.J. Abdul Kalam");

        Book book13 = new Book();
        book13.setBookId(13);
        book13.setTitle("Wings of Fire");
        book13.setAuthor("A.P.J. Abdul Kalam");

        Book book14 = new Book();
        book14.setBookId(14);
        book14.setTitle("Wings of Fire");
        book14.setAuthor("A.P.J. Abdul Kalam");


        Library library=new Library();
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        library.addBook(book5);
        library.addBook(book6);
        library.addBook(book7);
        library.addBook(book8);
        library.addBook(book9);
        library.addBook(book10);
        library.addBook(book11);
        library.addBook(book12);
        library.addBook(book13);
        library.addBook(book14);
        library.getAllBooks();


    }
}
       /* bookDetails.setPublisher("Universities page");
        bookDetails.setPrice(350.00);
        bookDetails.setPages(180);
        bookDetails.setPublicationYear(1999);

       /* Library library = new Library();
        boolean bookAdded = library.addBook(bookDetails);
        if (bookAdded){
        library.getBookInfo();
        }else{
            System.out.println("Application is not added");
        }
    }*/


