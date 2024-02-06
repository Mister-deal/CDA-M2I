package org.example.service;

import org.example.entity.Book;
import org.example.spi.port.LibraryRepository;

public class LibraryService {

    private final LibraryRepository libraryRepository;

    public LibraryService(LibraryRepository libraryRepository) {
        this.libraryRepository = libraryRepository;
    }

    public Book createBook(String title, String genre, int nbrPages){
        Book book = new Book(title, genre, nbrPages);
        if(libraryRepository.add(book)){
            return book;
        }
        throw new RuntimeException();
    }
}
