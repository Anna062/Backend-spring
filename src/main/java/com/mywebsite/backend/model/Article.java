package com.mywebsite.backend.model;

import jakarta.persistence.*;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Table(name = "Blog")
@Entity
public class Article {

    private String title;
    private String content;
    private String resume;
    private String author;
    private String date = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;

    public Article(String title, String content, String resume) {
        this.content = content;
        this.title = title;
        this.author = "Fatim Dicko";
        this.resume = resume;

    }

    public Article() {

    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getDate() {
        return date;
    }


    public String getResume() {
        return resume;
    }
}
