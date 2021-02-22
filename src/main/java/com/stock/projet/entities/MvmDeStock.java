package com.stock.projet.entities;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.Instant;
import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Entity
@Table(name = "mouvementDeStock")
public class MvmDeStock  implements Serializable {


    @Id
    @GeneratedValue
    private long idMvmDeStock;

    //@Temporal(TemporalType.TIMESTAMP)
    private Instant dateMvmStock;

    private BigDecimal quantite;

    private TypeMvmStock typeMovement;

    @ManyToOne
    @JoinColumn(name = "idArticle")
    private Article article;

    @CreatedDate
    @JsonIgnore
    private Instant dateCreation;

    @LastModifiedDate
    @JsonIgnore
    private Instant  dateDernierMiseAJour;
}
