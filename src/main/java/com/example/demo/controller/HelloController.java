package com.example.demo.controller;

import com.example.demo.mapper.UserMapper;
import com.example.demo.po.UserPO;
import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private UserMapper userMapper;

    @GetMapping("/hello")
    public Map<String, String> hello(@RequestParam(name = "userId", defaultValue = "0") int userId) {

        UserPO userPO = userMapper.getByUserId(userId);

        Map<String, String> result = new HashMap<>();

        result.put("userId", String.valueOf(userId));
        if (userPO != null) {
            result.put("name", userPO.getName());
            result.put("status", String.valueOf(userPO.getStatus()));
        }

        return result;
    }
}
