package com.spring.mangodb.repository;

import com.spring.mangodb.model.Role;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RoleRepository extends MongoRepository<Role, String> {
}
