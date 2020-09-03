package com.fsoft.frateapi.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.fsoft.frateapi.model.User;

public interface UserRepository extends MongoRepository<User, String> {
}
