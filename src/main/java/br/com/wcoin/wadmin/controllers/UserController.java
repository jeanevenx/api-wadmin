package br.com.wcoin.wadmin.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.wcoin.wadmin.models.User;
import br.com.wcoin.wadmin.services.UserServiceImpl;

@RestController
@RequestMapping("/api")
public class UserController{
	
	@Autowired
	private UserServiceImpl service;
	
	
	@PutMapping("/users")
	public ResponseEntity<User> updateUserData(@RequestBody User data){
	    User userData = service.updateUser(data);
	    
	    if(userData != null)
	        return ResponseEntity.ok(userData);
	    return ResponseEntity.badRequest().build();
	}
	
	@GetMapping("/users")
	public List<User> findAllUser(){
		return service.getAllUser();
		
	}
	
	@GetMapping("users/{id}")
	public ResponseEntity<User> getUserById(@PathVariable Integer id){
	    User user = service.getOneUser(id);
	    
	    if(user != null)
	        return ResponseEntity.ok(user);
	    return ResponseEntity.notFound().build();
	}
	
	@DeleteMapping("/users/{id}")
	public void removeUser(@PathVariable Integer id) {
	    service.deleteUser(id);
	}

}
