package com.stock.projet.repository;


import com.stock.projet.entities.CmdClient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CmdClientRepository extends JpaRepository<CmdClient,Long> {
}
