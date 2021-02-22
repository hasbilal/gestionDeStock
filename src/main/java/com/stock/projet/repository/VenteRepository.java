package com.stock.projet.repository;

import com.stock.projet.entities.Vente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface VenteRepository extends JpaRepository<Vente,Long> {

}
