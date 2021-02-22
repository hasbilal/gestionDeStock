package com.stock.projet.repository;

import com.stock.projet.entities.Article;
import com.stock.projet.entities.Categorie;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

@Repository
public interface CategorieRepository extends JpaRepository<Categorie,Long> {
   // Categorie findByName(String nom);
}
