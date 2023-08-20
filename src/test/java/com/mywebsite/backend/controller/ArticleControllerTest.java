package com.mywebsite.backend.controller;

import com.mywebsite.backend.model.Article;
import com.mywebsite.backend.repository.ArticleRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ArticleControllerTest {

    @Autowired
    private ArticleController controller;

    @Autowired
    private ArticleRepository repository;

    @Test
    void getArticles() {
    }

    @Test
    void getArticle() {
    }

    @Test
    void addArticle() {
        Article article = new Article("Title", "Ceci est un contenu statique.", "Contenu statique");
        controller.addArticle(article);
        assertTrue(repository.getArticleByTitle("Title").get().getContent().equals("Ceci est un contenu statique."));
    }

    @Test
    void deleteArticle() {
        Long id = repository.getArticleByTitle("Title").get().getId();
        try {
            controller.deleteArticle(id);

        } catch (Exception e){
            e.printStackTrace();
        }

    }

    @Test
    void updateArticle() {
    }
}