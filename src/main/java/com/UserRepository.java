package com;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository("userRepository")
public interface UserRepository extends MongoRepository<User, String> {
	User findOneByusername(String username);
}
