package com.madadipouya.elasticsearch.springdata.example.model;

import org.springframework.data.annotation.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName = "books", type = "book")
public class Book {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private String id;

    private String title;

    private int publicationYear;

    private String authorName;

    private String isbn;

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}
