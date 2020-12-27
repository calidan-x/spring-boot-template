package com.springboot.template.user.controller.v1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @GetMapping("/hello")
    String hello() {
        return "Hello";
    }

}
