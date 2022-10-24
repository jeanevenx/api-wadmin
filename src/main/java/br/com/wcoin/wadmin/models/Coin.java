package br.com.wcoin.wadmin.models;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;



@Entity
@Table(name="coins")
public class Coin {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="coin_id", nullable=false)
    private Integer id;

    @Column(name="name", length=100, nullable=false)
    private String name;

    @Column(name="operation", length=50, nullable=false)
    private String operation;
	// purchases - sales - transfers

	@Column(name="date", length=50, nullable=false)
    private LocalDate date;

    @Column(name="quantity", nullable=false)
    private Double quantity;

	@Column(name="symbol", length=30, nullable=false)
    private String symbol;

    @Column(name="market", length=30, nullable=true)
    private String market;

	@ManyToOne
   	@JoinColumn(name="user_id")
  	@JsonIgnoreProperties("coins")
   	private User user;



    public String getOperation() {
		return operation;
	}

	public void setOperation(String operation) {
		this.operation = operation.toLowerCase();
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public String getMarket() {
		return market;
	}

	public void setMarket(String market) {
		this.market = market;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

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
    
}
