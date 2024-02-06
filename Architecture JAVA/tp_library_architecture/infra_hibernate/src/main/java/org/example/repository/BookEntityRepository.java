package org.example.repository;

import org.example.entity.BookEntity;

import java.util.List;

public class BookEntityRepository extends BaseEntityRepository<BookEntity> {
    @Override
    BookEntity findById(Long id) {
        return null;
    }

    @Override
    List<BookEntity> findAll() {
        return null;
    }
}
