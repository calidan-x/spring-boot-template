package com.springboot.template.user.controller.v1;

import com.springboot.template.infra.client.example.ExampleClient;
import com.springboot.template.user.dto.resouce.UserResouce;
import com.springboot.template.user.service.UserService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@Slf4j
public class UserController {

    final private UserService userService;
    final private ExampleClient exampleClient;

    @GetMapping("/users")
    List<UserResouce> getAllUsers() {
        userService.addUser();
        return UserResouce.from(userService.getAllUsers());
    }

    @GetMapping("/comments")
    String getComments() {
        return exampleClient.getComments();
    }

}
