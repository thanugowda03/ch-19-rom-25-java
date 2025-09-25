package com.xworkz.libraryapp;

import com.xworkz.libraryapp.book.BookDetails;
import com.xworkz.libraryapp.library.Library;
import com.xworkz.libraryapp.library.LibraryImpl;

import java.util.Scanner;

public class LibraryRunner {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter No of Books:");
        int size = scanner.nextInt();

        LibraryImpl library = new LibraryImpl(size);
        for (int i=0; i<size; i++){
            BookDetails bookDetails = new BookDetails();
            System.out.println("Enter bookId:");
            bookDetails.setBookId(scanner.nextInt());
            System.out.println("Enter book title:");
            bookDetails.setTitle(scanner.next());
            System.out.println("Enter author:");
            bookDetails.setAuthor(scanner.next());
            System.out.println("Enter publisher:");
            bookDetails.setPublisher(scanner.next());
            System.out.println("Enter price:");
            bookDetails.setPrice(scanner.nextDouble());
            System.out.println("Enter number of pages:");
            bookDetails.setPages(scanner.nextInt());
            System.out.println("Enter publication year:");
            bookDetails.setPublicationYear(scanner.nextInt());

            library.addBook(bookDetails);
        }
        library.getAllBooks();

        System.out.println("Enter the book id update to book title:");scanner.nextLine();
        int bookId = scanner.nextInt();
        System.out.println("Enter the update book title:");
        library.updateBookTitleByBookId(bookId, scanner.next());
        library.getAllBooks();

        System.out.println("Enter the book title update to author name:");scanner.nextLine();
        String title = scanner.next();
        System.out.println("Enter update author name:");
        library.updateAuthorNameByBookTitle(title, scanner.next());
        library.getAllBooks();

        System.out.println("Enter the book publisher update to book title:"); scanner.nextLine();
        String title1 = scanner.next();
        System.out.println("Enter update publisher name:");
        library.updatePublisherByBookTitle(title1, scanner.next());
        library.getAllBooks();

        System.out.println("Enter the book price update to book id: "); scanner.nextLine();
        int bookId1 = scanner.nextInt();
        System.out.println("Enter update price:");
        library.updatePriceByBookId(bookId1,scanner.nextDouble());
        library.getAllBooks();

        System.out.println("Enter the book publication year update to book publisher:"); scanner.nextLine();
        String publisher = scanner.next();
        System.out.println("Enter update publication year:");
        library.updatePublicationYearByPublisher(publisher, scanner.nextInt());
        library.getAllBooks();

        System.out.println("Book book id fetch to book author:");scanner.nextLine();
        String author = library.getAuthorNameByBookId(scanner.nextInt());
        System.out.println(author);

        System.out.println("Book title fetch to book publisher name:"); scanner.nextLine();
        String publisher1 = library.getBookPublisherByBookTitle(scanner.next());
        System.out.println(publisher1);

        System.out.println("Book book id fetch to book price:"); scanner.nextLine();
        double price = library.getBookPriceByBookId(scanner.nextInt());
        System.out.println(price);

        System.out.println("Book title fetch to book pages:"); scanner.nextLine();
        int pages = library.getBookPagesByBookTitle(scanner.next());
        System.out.println(pages);

        System.out.println("Book publisher fetch to book publicationYear:"); scanner.nextLine();
        int publicationYear = library.getPublicationYearByBookPublisher(scanner.next());
        System.out.println(publicationYear);

        System.out.println("Book title fetch to book author:"); scanner.nextLine();
        String title2 = library.getAuthorByBookTitle(scanner.next());
        System.out.println(title2);

        System.out.println("Book author fetch to book publicationYear:"); scanner.nextLine();
        int publisher2 = library.getPublicationYearByAuthor(scanner.next());
        System.out.println(publisher2);

        /*BookDetails bookDetails = new BookDetails();
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
        }*/
        /*BookDetails bookDetails = new BookDetails();
        bookDetails.setBookId(1);
        bookDetails.setTitle("Wings of Fire");
        bookDetails.setAuther("A.P.J. Abdul Kalam");
        bookDetails.setPublisher("Universities page");
        bookDetails.setPrice(350.00);
        bookDetails.setPages(180);
        bookDetails.setPublicationYear(1999);

        BookDetails bookDetails1 = new BookDetails();
        bookDetails1.setBookId(2);
        bookDetails1.setTitle("The Discovery of India");
        bookDetails1.setAuther("Jawaharlal Nehru");
        bookDetails1.setPublisher("Oxford University Press");
        bookDetails1.setPrice(400.00);
        bookDetails1.setPages(500);
        bookDetails1.setPublicationYear(1946);

        BookDetails bookDetails2 = new BookDetails();
        bookDetails2.setBookId(4);
        bookDetails2.setTitle("Playing It My Way");
        bookDetails2.setAuther("Sachin Tendulkar");
        bookDetails2.setPublisher("Hodder & Stoughton");
        bookDetails2.setPrice(600.00);
        bookDetails2.setPages(496);
        bookDetails2.setPublicationYear(2014);

        BookDetails bookDetails3 = new BookDetails();
        bookDetails3.setBookId(3);
        bookDetails3.setTitle("India Wins Freedom");
        bookDetails3.setAuther("Maulana Abul Kalam Azad");
        bookDetails3.setPublisher("Orient Blackswan");
        bookDetails3.setPrice(320.00);
        bookDetails3.setPages(400);
        bookDetails3.setPublicationYear(1957);

        BookDetails bookDetails4 = new BookDetails();
        bookDetails4.setBookId(5);
        bookDetails4.setTitle("Ignited Minds");
        bookDetails4.setAuther("A.P.J. Abdul Kalam");
        bookDetails4.setPublisher("Penguin Books");
        bookDetails4.setPrice(250.00);
        bookDetails4.setPages(205);
        bookDetails4.setPublicationYear(2002);

        BookDetails bookDetails5 = new BookDetails();
        bookDetails5.setBookId(6);
        bookDetails5.setTitle("The Guide");
        bookDetails5.setAuther("R.K. Narayan");
        bookDetails5.setPublisher("Indian Thought Publications");
        bookDetails5.setPrice(200.00);
        bookDetails5.setPages(220);
        bookDetails5.setPublicationYear(1958);

        BookDetails bookDetails6 = new BookDetails();
        bookDetails6.setBookId(7);
        bookDetails6.setTitle("Midnight's Children");
        bookDetails6.setAuther("Salman Rushdie");
        bookDetails6.setPublisher("Jonathan Cape");
        bookDetails6.setPrice(450.00);
        bookDetails6.setPages(600);
        bookDetails6.setPublicationYear(1981);

        BookDetails bookDetails7 = new BookDetails();
        bookDetails7.setBookId(8);
        bookDetails7.setTitle("The White Tiger");
        bookDetails7.setAuther("Aravind Adiga");
        bookDetails7.setPublisher("HarperCollins");
        bookDetails7.setPrice(380.00);
        bookDetails7.setPages(320);
        bookDetails7.setPublicationYear(2008);

        BookDetails bookDetails8 = new BookDetails();
        bookDetails8.setBookId(9);
        bookDetails8.setTitle("God of Small Things");
        bookDetails8.setAuther("Arundhati Roy");
        bookDetails8.setPublisher("IndiaInk");
        bookDetails8.setPrice(370.00);
        bookDetails8.setPages(340);
        bookDetails8.setPublicationYear(1997);

        BookDetails bookDetails9 = new BookDetails();
        bookDetails9.setBookId(10);
        bookDetails9.setTitle("Train to Pakistan");
        bookDetails9.setAuther("Khushwant Singh");
        bookDetails9.setPublisher("Chatto & Windus");
        bookDetails9.setPrice(280.00);
        bookDetails9.setPages(250);
        bookDetails9.setPublicationYear(1956);

        BookDetails bookDetails10 = new BookDetails();
        bookDetails10.setBookId(11);
        bookDetails10.setTitle("Gitanjali");
        bookDetails10.setAuther("Rabindranath Tagore");
        bookDetails10.setPublisher("Macmillan Publishers");
        bookDetails10.setPrice(300.00);
        bookDetails10.setPages(120);
        bookDetails10.setPublicationYear(1910);

        BookDetails bookDetails11 = new BookDetails();
        bookDetails11.setBookId(12);
        bookDetails11.setTitle("The Great Indian Novel");
        bookDetails11.setAuther("Shashi Tharoor");
        bookDetails11.setPublisher("Viking");
        bookDetails11.setPrice(420.00);
        bookDetails11.setPages(430);
        bookDetails11.setPublicationYear(1989);

        BookDetails bookDetails12 = new BookDetails();
        bookDetails12.setBookId(13);
        bookDetails12.setTitle("Interpreter of Maladies");
        bookDetails12.setAuther("Jhumpa Lahiri");
        bookDetails12.setPublisher("Houghton Mifflin");
        bookDetails12.setPrice(360.00);
        bookDetails12.setPages(198);
        bookDetails12.setPublicationYear(1999);

        BookDetails bookDetails13 = new BookDetails();
        bookDetails13.setBookId(14);
        bookDetails13.setTitle("The Inheritance of Loss");
        bookDetails13.setAuther("Kiran Desai");
        bookDetails13.setPublisher("Penguin Books");
        bookDetails13.setPrice(390.00);
        bookDetails13.setPages(324);
        bookDetails13.setPublicationYear(2006);


        Library library = new Library();
        library.addBook(bookDetails);
        library.addBook(bookDetails1);
        library.addBook(bookDetails2);
        library.addBook(bookDetails3);
        library.addBook(bookDetails4);
        library.addBook(bookDetails5);
        library.addBook(bookDetails6);
        library.addBook(bookDetails7);
        library.addBook(bookDetails8);
        library.addBook(bookDetails9);
        library.addBook(bookDetails10);
        library.addBook(bookDetails11);
        library.addBook(bookDetails12);
        library.addBook(bookDetails13);
        library.getAllBooks();*/
    }
}
