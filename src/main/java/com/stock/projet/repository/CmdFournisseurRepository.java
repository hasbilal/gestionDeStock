package com.stock.projet.repository;


import com.stock.projet.entities.CmdFournisseur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CmdFournisseurRepository extends JpaRepository<CmdFournisseur,Long> {
}
