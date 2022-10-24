package br.com.wcoin.wadmin.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import br.com.wcoin.wadmin.models.Coin;
import br.com.wcoin.wadmin.models.User;
import br.com.wcoin.wadmin.repositories.UserRepository;

@Service
public class UserServiceImpl implements IUserService {
	
	@Autowired
	private UserRepository repo;

	@Autowired
    PasswordEncoder encoder;

	@Override
	public List<User> getAllUser() {
		return (List<User>) repo.findAll();
	}

	@Override
	public User getOneUser(Integer id) {
		
		return repo.findById(id).orElse(null);
	}

	@Override
	public User updateUser(User data) {
		if(data.getId() != null) {
			data.setPassword(encoder.encode(data.getPassword()));
			return repo.save(data);
		}
		return null;
	}

	@Override
	public void deleteUser(Integer id) {
		repo.deleteById(id);
		
	}

	@Override
	public User saveUser(User data) {

		if(data.getName() != null && data.getPassword()!= null) {
			for(Coin coin: data.getCoins()){
				coin.setUser(data);
			}
			return repo.save(data);
		}
		return null;
	}
    
}
