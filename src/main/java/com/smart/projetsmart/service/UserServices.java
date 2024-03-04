package com.smart.projetsmart.service;

import java.util.List;
import org.springframework.http.ResponseEntity;
import com.smart.projetsmart.entity.User;

public interface UserServices {

    public ResponseEntity<?> addUser(User userInfo);

    public User fidUserByUsername(String username);

    public void DeleteUser(Integer id);

    public boolean findUserById(Integer id);

    public List<User> getUsers();
}
