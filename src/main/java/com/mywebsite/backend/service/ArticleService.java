package com.mywebsite.backend.service;

import com.mywebsite.backend.model.Article;
import com.mywebsite.backend.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ArticleService {

    @Autowired
    private ArticleRepository repository;

    public List<Article> getArticles(){
        ArrayList<Article> articles = new ArrayList<>();
        repository.findAll().forEach(article -> {
            articles.add(article);
        });

        return articles;
    }

    public void addArticle(Article article){
        Optional<Article> optionalTitle = repository.getArticleByTitle(article.getTitle());
        Optional<Article> optionalContent = repository.getArticleByContent(article.getContent());

        if(!optionalTitle.isEmpty() || !optionalContent.isEmpty()){
            throw new IllegalStateException("Article deja présent dans la base de données");
        } else {
            repository.save(article);
        }
    }

    public void deleteArticle(Long id){
        
        try {
            repository.deleteById(id);
        } catch (Exception e){
            e.printStackTrace();
        }
    }
    
    public void updateArticle(Long id, Article article){
        repository.save(article);
        repository.deleteById(id);
    }

    public Article getArticle(Long id) {
        return repository.findById(id).orElse(null);
    }
}
