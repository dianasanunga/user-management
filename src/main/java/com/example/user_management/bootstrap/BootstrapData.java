package com.example.user_management.bootstrap;

import com.example.user_management.entity.UserApp;
import com.example.user_management.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootstrapData  implements CommandLineRunner {
    private final UserRepository userRepository;

    public BootstrapData(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    public void createUsers(){
        UserApp userApp1 = new UserApp();
        userApp1.setUserId("1");
        userApp1.setName("Diana");
        userApp1.setLastname("Sanunga");
        userApp1.setEmail("dianasanunga@gmail.com");
        userApp1.setUsername("diana.carolina");
        userApp1.setPassword("12345");

        UserApp userApp2 = new UserApp();
        userApp2.setUserId("2");
        userApp2.setName("Administrador");
        userApp2.setLastname("1");
        userApp2.setEmail("admi@ups.edu.ec");
        userApp2.setUsername("admi");
        userApp2.setPassword("123456");


    }


    @Override
    public void run(String... args) throws Exception {
        createUsers();
        System.out.println("---------Started BootstrapData---------");
        System.out.println("Number of users: "  + userRepository.count());

    }
}
