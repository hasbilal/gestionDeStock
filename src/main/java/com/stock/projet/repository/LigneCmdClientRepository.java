package com.stock.projet.repository;


import com.stock.projet.entities.LigneCmdClient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface LigneCmdClientRepository  extends JpaRepository<LigneCmdClient,Long> {
}
