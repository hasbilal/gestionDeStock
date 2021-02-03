package com.stock.projet.entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "mouvementDeStock")
public class MvmDeStock  implements Serializable {

    public static final int entree =1;
    public static final int sortie =2;

    @Id
    @GeneratedValue
    private long idMvmDeStock;

    @Temporal(TemporalType.TIMESTAMP)
    private Date dateMvmStock;

    private BigDecimal quantite;

    private int typeMovement;

    @ManyToOne
    @JoinColumn(name = "idArticle")
    private Article article;
}
