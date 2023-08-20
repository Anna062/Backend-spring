package com.mywebsite.backend.model;

import jakarta.persistence.*;

@Table(name = "Todos")
@Entity
public class Todo {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;
    private String title;

    @Column(name = "status")
    private boolean isDone;
    private String description;

    public Todo() {}
    public Todo(Long id, String title, boolean isDone, String description) {
        this.id = id;
        this.title = title;
        this.isDone = isDone;
        this.description = description;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isDone() {
        return isDone;
    }

    public void setDone(boolean done) {
        isDone = done;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
