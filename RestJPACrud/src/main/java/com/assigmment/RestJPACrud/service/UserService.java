package com.assigmment.RestJPACrud.service;

import com.assigmment.RestJPACrud.entity.User;
import com.assigmment.RestJPACrud.jpa.UserRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService implements GenericService<User, String> {
	private final UserRepository userRepository;
	
	public UserService(final UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	@Override
	public CrudRepository<User, String> getRepository() {
		return this.userRepository;
	}

	@Override
	public String getId(User entity) {
		return entity.getUserId();
	}
	
	@Override
	public User save(User entity) {
		return GenericService.super.save(entity);
	}

}
