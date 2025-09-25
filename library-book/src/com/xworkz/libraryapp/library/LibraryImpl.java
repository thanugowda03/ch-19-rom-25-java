package com.xworkz.libraryapp.library;

import com.xworkz.libraryapp.book.BookDetails;

public class LibraryImpl implements Library {

    public LibraryImpl(int size){
        bookDetail = new BookDetails[size];
    }

    public BookDetails[] bookDetail;
    int index;
@Override
    public boolean addBook(BookDetails bookDetails){
        boolean isBookAdded = false;
        if (bookDetails != null){
            bookDetail[index++]=bookDetails;
            isBookAdded = true;
        }
        else {
            System.out.println("Invalid bookdetails");
        }
        return isBookAdded;
    }
    @Override
    public boolean updateBookTitleByBookId(int bookId, String updateBookTitle){
        boolean bookTitleUpdate = false;
        for (BookDetails bookDetails:this.bookDetail){
            if (bookDetails.getBookId()==bookId){
                bookDetails.setTitle(updateBookTitle);
                System.out.println("Update book title");
                bookTitleUpdate = true;
            }
        }
        if (bookTitleUpdate == false) System.out.println("Book id"+bookId+"does not exist");
        return bookTitleUpdate;
    }
@Override
    public boolean updateAuthorNameByBookTitle(String title, String updateAuthorName){
        boolean authorNameUpdate = false;
        if (title != null){
            for (BookDetails bookDetails:this.bookDetail){
                if (bookDetails.getTitle().equals(title)){
                    bookDetails.setAuthor(updateAuthorName);
                    System.out.println("Author name Update");
                    authorNameUpdate = true;
                }
            }
        }
        if (authorNameUpdate == false) System.out.println("Title "+title+"does not exist");
        return authorNameUpdate;
    }
@Override
    public boolean updatePublisherByBookTitle(String title1, String newPublisher) {
        boolean isUpdated = false;
        for (BookDetails bookDetails : this.bookDetail) {
            if (bookDetails.getTitle().equals(title1)) {
                bookDetails.setPublisher(newPublisher);
                System.out.println("Publisher updated successfully");
                isUpdated = true;
            }
        }
        if (isUpdated != false) System.out.println("Book title " + title1 + " not found");
        return isUpdated;
    }
@Override
    public boolean updatePriceByBookId(int bookId1, double newPrice) {
        boolean isUpdated = false;
        for (BookDetails bookDetails : this.bookDetail) {
            if (bookDetails.getBookId() == bookId1) {
                bookDetails.setPrice(newPrice);
                System.out.println("Price updated successfully");
                isUpdated = true;
            }
        }
        if (isUpdated != false) System.out.println("Book ID " + bookId1 + " not found");
        return isUpdated;
    }
@Override
    public boolean updatePublicationYearByPublisher(String publisher , int newPublicationYear){
        boolean isUpdated = false;

        for (BookDetails bookDetails:this.bookDetail){
            if (bookDetails.getPublisher().equals(publisher)){
                bookDetails.setPublicationYear(newPublicationYear);
                System.out.println("Publication Year updated successfully");
                isUpdated = true;
            }
        }
        if (isUpdated != false) System.out.println("Book publisher" +publisher+ "not found");
        return isUpdated;
    }
@Override
    public String getAuthorNameByBookId(int bookId){
        String authorName = null;
        if (bookId > 0)
            for (BookDetails bookDetails:this.bookDetail){
                if (bookDetails.getBookId()==bookId){
                    return bookDetails.getAuthor();
                }
            }
        if (bookId != 0) System.out.println("Book author name is not found book id");
        return  authorName;
    }
@Override
    public String getBookPublisherByBookTitle(String title){
        String publisher1 = null;

        if (title != null)
            for (BookDetails bookDetails:this.bookDetail){
                if (bookDetails.getTitle().equals(title)){
                    return bookDetails.getPublisher();
                }
            }
        if (publisher1 != null) System.out.println("Book publisher is not found book title");
        return publisher1;
    }
@Override
    public double getBookPriceByBookId(int bookId){
        double price = 0.0;

        if (bookId > 0)
            for (BookDetails bookDetails:this.bookDetail){
                if (bookDetails.getBookId()==bookId){
                    return bookDetails.getPrice();
                }
            }
        if (price != 0) System.out.println("Book price is not found book id");
        return price;
    }
@Override
    public int getBookPagesByBookTitle(String title){
        int pages = 0;

        if (title != null)
            for (BookDetails bookDetails:this.bookDetail){
                if (bookDetails.getTitle().equals(title)){
                    return bookDetails.getPages();
                }
            }
        if (pages != 0) System.out.println("Book pages is not found book title");
        return pages;
    }
@Override
    public int getPublicationYearByBookPublisher(String publisher){
        int publicationYear = 0;

        if (publisher != null)
            for (BookDetails bookDetails:this.bookDetail){
                if (bookDetails.getPublisher().equals(publisher)){
                    return bookDetails.getPublicationYear();
                }
            }
        if (publicationYear != 0) System.out.println("Book publisher is not found book publisher");
        return publicationYear;
    }
@Override
    public String getAuthorByBookTitle(String title2){
        String author = null;

        if (title2 != null)
            for (BookDetails bookDetails:this.bookDetail){
                if (bookDetails.getTitle().equals(title2)){
                    return bookDetails.getAuthor();
                }
            }
        if (author != null) System.out.println("Book author name is not found book title");
        return author;
    }
@Override
    public int getPublicationYearByAuthor(String author){
        int publicationYear = 0;

        if (author != null)
            for (BookDetails bookDetails:this.bookDetail){
                if (bookDetails.getAuthor().equals(author)){
                    return bookDetails.getPublicationYear();
                }
            }
        if (publicationYear != 0) System.out.println("Book publisher year is not found book author");
        return publicationYear;
    }
    @Override
    public void getAllBooks() {
        System.out.println("List of books are: "+bookDetail.length);
        for (BookDetails bookDetails : bookDetail) {
            System.out.println("The book id: " + bookDetails.getBookId());
            System.out.println("Book title: "+bookDetails.getTitle());
            System.out.println("Book auther: "+bookDetails.getAuthor());
            System.out.println("Book publisher: "+bookDetails.getPublisher());
            System.out.println("Book price: "+bookDetails.getPrice());
            System.out.println("Book pages: "+bookDetails.getPages());
            System.out.println("Book publication year: "+bookDetails.getPublicationYear());
            System.out.println("");
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
        System.out.println("Book auther: "+bookDetails.getAuther());
        System.out.println("Book publisher: "+bookDetails.getPublisher());
        System.out.println("Book price: "+bookDetails.getPrice());
        System.out.println("Book pages: "+bookDetails.getPages());
        System.out.println("Book publication year: "+bookDetails.getPublicationYear());
    }*/


