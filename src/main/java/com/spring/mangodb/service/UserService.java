package com.spring.mangodb.service;

import com.spring.mangodb.model.Role;
import com.spring.mangodb.model.User;
import com.spring.mangodb.repository.RoleRepository;
import com.spring.mangodb.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;
    private final RoleRepository roleRepository;

    public UserService(UserRepository userRepository, RoleRepository roleRepository) {
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
    }

    public User save(User user) {
        Role role = new Role();
        role.setRoleName("DEV");
        role.setId(user.getId());
        roleRepository.save(role);

        return userRepository.save(user);
    }

    public User getByEmail(String email) {
        return userRepository.findByEmail(email);
    }
}