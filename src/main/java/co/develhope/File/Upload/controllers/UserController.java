package co.develhope.File.Upload.controllers;

import co.develhope.File.Upload.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping
    public void create(){

    }
    @PostMapping("/{id}/profile")
    public void uploadProfileImage(){

    }
    @GetMapping
    public void getAll(){

    }
    @GetMapping("/{id}")
    public void getOne(){

    }
    @PutMapping("/{id}")
    public void update(){

    }
    @DeleteMapping("/{id}")
    public void delete(){

    }
}
