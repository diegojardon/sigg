package mx.gluo.management.authorizationservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthorizationController {

    @GetMapping("/test")
    public String getTest(){
        System.out.println("LLEGO A TEST");
        return "Texto de prueba";
    }


}
