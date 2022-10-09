package br.com.wcoin.wadmin.services;

import java.util.List;

import br.com.wcoin.wadmin.models.User;

public interface IUserService {
	public List<User> getAllUser();
    public User getOneUser(Integer id);
    public User updateUser(User data);
    public void deleteUser(Integer id);
    public User saveUser(User data);
}
