package com.springboot.template.user.dto.resouce;

import com.springboot.template.user.entity.User;
import java.util.List;
import java.util.stream.Collectors;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserResouce {

    private String id;
    private String name;
    private int age;

    public static UserResouce from(User user) {
        return UserResouce.builder().id(user.getId()).name(user.getName()).age(user.getAge()).build();
    }

    public static List<UserResouce> from(List<User> users) {
        return users.stream().map(UserResouce::from).collect(Collectors.toList());
    }
}
