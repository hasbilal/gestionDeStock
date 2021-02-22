package com.stock.projet.repository;

import com.stock.projet.entities.LigneCmdFournisseur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface LigneCmdFournisseurRepository  extends JpaRepository<LigneCmdFournisseur,Long> {
}
