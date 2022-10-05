package br.com.wcoin.wadmin.models;

import lombok.Data;

@Data
public class Coin {
    
    private Integer id;
    private String name;
    private Double quantity;
    private String symbol;
    private String logo;
}
