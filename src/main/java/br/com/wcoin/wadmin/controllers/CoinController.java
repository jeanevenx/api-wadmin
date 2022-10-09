package br.com.wcoin.wadmin.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.wcoin.wadmin.models.Coin;
import br.com.wcoin.wadmin.services.CoinServiceImpl;

@RestController
@RequestMapping("/api")
public class CoinController {
	
	@Autowired
	private CoinServiceImpl service;
	
	@PostMapping("/coins")
	public ResponseEntity<Coin> registerCoin(@RequestBody Coin newCoin){
		Coin coin = service.saveCoin(newCoin);
		
		if(coin != null) {
			return ResponseEntity.ok(coin);
		}
		
		return ResponseEntity.badRequest().build();
	}
	
	@GetMapping("/coins")
	public List<Coin> findAllCoin(){
		return service.getAllCoin();
	}
	
	

}
