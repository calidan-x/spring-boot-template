package com.springboot.template.infra.client.example;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "ExampleClient", url = "https://my-json-server.typicode.com/typicode/demo")
public interface ExampleClient {

    @GetMapping("/comments")
    String getComments();
}
