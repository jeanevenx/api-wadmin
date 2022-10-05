package br.com.wcoin.wadmin.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="coin")
public class Coin {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="coin_id", nullable=false)
    private Integer id;

    @Column(name="name", length=100, nullable=false)
    private String name;

    @Column(name="quantity", nullable=false)
    private Double quantity;

    @Column(name="symbol", length=30, nullable=false)
    private String symbol;

    @Column(name="origin", length=30, nullable=true)
    private String origin;

    @Column(name="symbol", length=100, nullable=false)
    private String logo;
}
