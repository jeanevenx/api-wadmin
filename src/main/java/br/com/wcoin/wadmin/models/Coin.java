package br.com.wcoin.wadmin.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



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

    @Column(name="logo", length=100, nullable=false)
    private String logo;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getQuantity() {
		return quantity;
	}

	public void setQuantity(Double quantity) {
		this.quantity = quantity;
	}

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}
    
    
    
    
}
