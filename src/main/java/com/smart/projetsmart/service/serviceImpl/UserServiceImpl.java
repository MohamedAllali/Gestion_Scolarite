package com.smart.projetsmart.service.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import com.smart.projetsmart.repostory.UserRepository;
import com.smart.projetsmart.repostory.RoleRepository;
import com.smart.projetsmart.entity.User;
import com.smart.projetsmart.entity.Role;
import com.smart.projetsmart.service.UserServices;
import java.util.List;

@Service
public class UserServiceImpl implements UserServices {

    @Autowired
    private UserRepository appUserRepository;

    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;


    @Override
    public ResponseEntity<?> addUser(User userInfo) {
        userInfo.setPassword(passwordEncoder.encode(userInfo.getPassword()));
        Role roleUse = roleRepository.findById(2).get();
        userInfo.setRole(roleUse);
        UserRepository.save(userInfo);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @Override
    public User fidUserByUsername(String username) {
        return UserRepository.findByUsername(username).get();
    }

    @Override
    public void DeleteUser(Integer id) {
        UserRepository.deleteById(id);
    }

    @Override
    public boolean findUserById(Integer id) {
        if (UserRepository.findById(id).isPresent()) {
            return true;
        }
        return false;
    }

    @Override
    public List<User> getUsers() {
        return appUserRepository.findAll();
    }

    public User getUserById(Integer id) {
        if (appUserRepository.findById(id).isPresent()) {
            return UserRepository.findById(id).get();
        }
        return null;
    }
}
