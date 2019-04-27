package com.akbar.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserService {

    @Autowired
    private UserRepository repository;

    public void addUser(UserEntity userEntity) {
        new UserController().addUserEntity(repository, userEntity);
    }


}
