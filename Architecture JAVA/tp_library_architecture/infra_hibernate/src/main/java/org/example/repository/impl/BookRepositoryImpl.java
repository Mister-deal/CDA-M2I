package org.example.repository.impl;

import org.example.entity.Book;
import org.example.entity.BookEntity;
import org.example.repository.BookEntityRepository;
import org.example.spi.port.LibraryRepository;

import java.util.List;

public class BookRepositoryImpl implements LibraryRepository {

    private BookEntityRepository bookEntityRepository;

    public BookRepositoryImpl(BookEntityRepository bookEntityRepository) {
        this.bookEntityRepository = bookEntityRepository;
    }

    @Override
    public boolean add(Book book) {
        try {
            //ouvrir session hibernate
            //ouvrir transaction
            BookEntity bookEntity = BookEntity.builder()
                    .title(book.getTitle())
                    .genre(book.getGenre())
                    .nbrPages(book.getNbrPages())
                    .build();
            bookEntityRepository.create(bookEntity);
            book.setId(bookEntity.getId());
            return true;
        }catch (Exception exception){
            return false;
        }
    }

    @Override
    public boolean delete(Long id) {
        return false;
    }

    @Override
    public boolean update(Book book) {
        return false;
    }

    @Override
    public Book findById(Long id) {
        return null;
    }

    @Override
    public List<Book> findAll() {
        return null;
    }
}
