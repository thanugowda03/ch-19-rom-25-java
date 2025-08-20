package com.xworkz.library;

import com.xworkz.library.lib.Library;

public class LibraryRunner {
    public static void main(String[] args) {
        System.out.println("main started");
        Library library=new Library();
        library.setLibraryId(1);
        library.setLibraryName("Jnana Degula");
        library.setLocation("Sullia");

        int libraryId=library.getLibraryId();
        String libraryName=library.getLibraryName();
        String location=library.getLocation();

        System.out.println("Libraray Id "+libraryId);
        System.out.println("Library Name "+libraryName);
        System.out.println("Location "+location);

        System.out.println("main ended");
    }
}
