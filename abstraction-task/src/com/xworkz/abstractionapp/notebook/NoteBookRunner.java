package com.xworkz.abstractionapp.notebook;

import com.xworkz.abstractionapp.notebook.impl.ClassMateImpl;

public class NoteBookRunner {
    public static void main(String[] args) {
        NoteBook book=new ClassMateImpl();
        book.noOfPages();
        book.price();
        book.ruledOrUnruled();
    }
}
