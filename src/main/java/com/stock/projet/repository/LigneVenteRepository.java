package com.stock.projet.repository;

import com.stock.projet.entities.LigneVente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface LigneVenteRepository extends JpaRepository<LigneVente,Long> {
}
