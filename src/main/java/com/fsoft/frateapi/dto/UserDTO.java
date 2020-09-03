package com.fsoft.frateapi.dto;

import java.io.Serializable;

import com.fsoft.frateapi.model.User;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private String name;
	private String surname;
	private String email;
	
	public UserDTO(User user) {
		this.name = user.getName();
		this.email = user.getEmail();
		this.surname = user.getSurname();
	}

}
