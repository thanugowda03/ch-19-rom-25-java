package com.xworkz.libraryapp.library;

import com.xworkz.libraryapp.book.BookDetails;

public interface Library {

    boolean addBook(BookDetails bookDetails);

    boolean updateBookTitleByBookId(int bookId, String updateBookTitle);

    boolean updateAuthorNameByBookTitle(String title, String updateAuthorName);

    boolean updatePublisherByBookTitle(String title1, String newPublisher);

    boolean updatePriceByBookId(int bookId1, double newPrice);

    boolean updatePublicationYearByPublisher(String publisher , int newPublicationYear);

    String getAuthorNameByBookId(int bookId);

    String getBookPublisherByBookTitle(String title);

    double getBookPriceByBookId(int bookId);

    int getBookPagesByBookTitle(String title);

    int getPublicationYearByBookPublisher(String publisher);

    String getAuthorByBookTitle(String title2);

    int getPublicationYearByAuthor(String author);

    void getAllBooks();
}
