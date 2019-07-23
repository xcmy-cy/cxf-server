package com.example.cxfserver.server.impl;

import com.example.cxfserver.server.User;
import com.example.cxfserver.server.UserService;
import org.springframework.stereotype.Component;

import javax.jws.WebService;
import java.util.HashMap;
import java.util.Map;

//这是一个服务接口的实现
//这里可以指定但是不知道为什么会影响服务端的调用 所以使用了默认的命名空间
@WebService
//需要被发现
@Component
public class UserServiceImpl implements UserService {

    @Override
    public String getUserName(String userId) {
        return "userId为：" + userId;
    }

    @Override
    public String getUser(String userId) {
        Map<Integer, User> userMap = new HashMap<>();
        User user = new User();
        user.setId(1);
        user.setName("test1");
        userMap.put(user.getId(), user);

        user = new User();
        user.setId(2);
        user.setName("test2");
        userMap.put(user.getId(), user);

        user = new User();
        user.setId(3);
        user.setName("test3");
        userMap.put(user.getId(), user);

        System.out.println("userMap是:" + userMap);
        return userMap.get(Integer.valueOf(userId)).getName();
    }
}
