package com.fsoft.frateapi.enviroment;

import static java.util.Arrays.asList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.fsoft.frateapi.model.User;
import com.fsoft.frateapi.repository.UserRepository;

@Configuration
public class LocalEnviroment implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public void run(String... args) throws Exception {
		userRepository.deleteAll();
		
		User user = new User(null, "user", "test", "test@test.com", "123456");
		userRepository.saveAll(asList(user));
	}

}
