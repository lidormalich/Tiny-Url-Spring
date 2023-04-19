package com.handson.tinyurl.repository;

import com.handson.tinyurl.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserRepository extends MongoRepository<User, String> {
    User findFirstByName(String name);

}

