package com.akbar.app;

import org.springframework.stereotype.Controller;

@Controller
public class UserController {

//    @Autowired
//    UserRepository userRepository;
//    public void addUser(UserEntity userEntity) {
//        userRepository.save(userEntity);
//    }

    public void addUserEntity(UserRepository userRepository, UserEntity userEntity) {
        userRepository.save(userEntity);
    }

}
