package com.example.adapterrest.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.awt.print.Book;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BookDTO {

    Long id;

    String title;

    String genre;

    int nbrPages;

    public Book toEntity(){
        return Book.builder().title(title).genre(genre).nbrPages(nbrPages).build();
    }
}
