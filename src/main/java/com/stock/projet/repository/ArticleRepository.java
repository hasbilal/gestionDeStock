package com.stock.projet.repository;

import com.stock.projet.entities.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;


import java.util.Optional;

@Repository
public interface ArticleRepository  extends JpaRepository<Article,Long> {
    //Article findByName(String nom);
}
