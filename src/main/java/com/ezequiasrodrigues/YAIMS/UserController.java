package com.ezequiasrodrigues.YAIMS;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    private final UserRepository userRepository;
    public UserController(UserRepository userRepository){
        this.userRepository = userRepository;
    }
    //Configurando Handlers temporarios para /users
    @GetMapping("/users")
    public Iterable<User> findAllUsers(){ return this.userRepository.findAll();}
    @PostMapping("/users")
    public User addOneUser(@RequestBody User user){ return this.userRepository.save(user);}
}
