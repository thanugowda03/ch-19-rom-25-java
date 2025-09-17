package com.xworkz.abstractionapp.notebook.impl;

import com.xworkz.abstractionapp.notebook.NoteBook;

public class ClassMateImpl implements NoteBook {
    @Override
    public void noOfPages() {
        System.out.println("No of pages are 200");
    }

    @Override
    public void price() {
        System.out.println("Price is 55Rs");

    }

    @Override
    public void ruledOrUnruled() {
        System.out.println("Book is Ruled");

    }
}
