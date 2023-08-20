package com.mywebsite.backend.controller;

import com.mywebsite.backend.model.Article;
import com.mywebsite.backend.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
public class ArticleController {

    @Autowired
    private ArticleService service;

    @GetMapping("/articles")
    public List<Article> getArticles(){
        return service.getArticles();
    }

    @GetMapping("/articles/{id}")
    public Article getArticle(@PathVariable Long id){
        return service.getArticle(id);
    }

    @PostMapping("/articles")
    public void addArticle(@RequestBody Article article){
        service.addArticle(article);
    }

    @DeleteMapping("/articles/{id}")
    public void deleteArticle(@PathVariable Long id){
        service.deleteArticle(id);
    }

    @PutMapping("/articles/{id}")
    public void updateArticle(@PathVariable Long id, @RequestBody Article article){
        service.updateArticle(id, article);
    }

}
