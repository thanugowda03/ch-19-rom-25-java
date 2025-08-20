package com.xworkz.libraryapp.book;

public class BookDetails {

    private  int bookId;
    private String title;
    private String auther;
    private String publisher;
    private double price;
    private int pages;
    private int publicationYear;

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }
    public String getTitle(){
        return  title;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public String getAuther(){
        return auther;
    }
    public void setAuther(String auther){
        this.auther = auther;
    }
    public String getPublisher(){
        return publisher;
    }
    public void setPublisher(String publisher){
        this.publisher = publisher;
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public int getPages(){
        return pages;
    }
    public void setPages(int pages){
        this.pages = pages;
    }
    public int getPublicationYear(){
        return publicationYear;
    }
    public void setPublicationYear(int publicationYear){
        this.publicationYear = publicationYear;
    }
}
