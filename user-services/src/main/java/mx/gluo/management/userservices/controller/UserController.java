package mx.gluo.management.userservices.controller;

import mx.gluo.management.userservices.entity.SiggUser;
import mx.gluo.management.userservices.model.Profile;
import mx.gluo.management.userservices.service.ProfileService;
import mx.gluo.management.userservices.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.vault.core.VaultTemplate;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    private RegisterService registerService;

    @Autowired
    private ProfileService profileService;


    @PostMapping("/register")
    public void registerUser(@RequestBody SiggUser siggUser){
        registerService.registerUser(siggUser);
    }

    @GetMapping("/profile")
    public Profile getUserProfile(@RequestHeader("id") String username){
        //String username = "Diego";
        System.out.println("ID RECIBIDO: " + username);
        return profileService.getUserProfile(username);
    }
}
