package com.springboot.template.user.service;

import com.springboot.template.user.entity.User;
import com.springboot.template.user.repository.UserRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    final private UserRepository userRepository;

    public void addUser() {
        User user = new User();
        user.setName("John");
        user.setAge(12);
        userRepository.save(user);
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

}
