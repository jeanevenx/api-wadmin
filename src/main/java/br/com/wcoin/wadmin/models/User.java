package br.com.wcoin.wadmin.models;

import lombok.Data;

@Data
public class User {

    private Integer id;
    private String name;
    private String username;
    private String email;
    private String password;
    private String avatar;

    
}
