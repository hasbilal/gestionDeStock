package com.stock.projet.repository;

import com.stock.projet.entities.MvmDeStock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface MvmDeStockRepository  extends JpaRepository<MvmDeStock,Long> {
}
