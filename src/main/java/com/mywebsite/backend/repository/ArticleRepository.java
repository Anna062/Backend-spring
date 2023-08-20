package com.mywebsite.backend.repository;

import com.mywebsite.backend.model.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface ArticleRepository extends JpaRepository<Article, Long> {

    @Query("SELECT a FROM Article a WHERE a.title = ?1 ")
     Optional<Article> getArticleByTitle(String title);

    @Query("SELECT a FROM Article a WHERE a.content = ?1 ")
     Optional<Article> getArticleByContent(String content);

}
