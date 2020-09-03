package com.fsoft.frateapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fsoft.frateapi.model.User;
import com.fsoft.frateapi.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;

	public void insert(User user) {
//		BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
//		final String encryptedPassword = bCryptPasswordEncoder.encode(user.getPassword());
//
//		user.setPassword(encryptedPassword);
//
//		final User createdUser = userRepository.save(user);
//
//		final ConfirmationToken confirmationToken = new ConfirmationToken(user);
//
//		confirmationTokenService.saveConfirmationToken(confirmationToken);

	}

	public List<User> findAll() {
		return repository.findAll();
	}

}
