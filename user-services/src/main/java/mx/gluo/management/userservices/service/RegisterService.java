package mx.gluo.management.userservices.service;

import mx.gluo.management.userservices.entity.SiggUser;
import mx.gluo.management.userservices.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegisterService {

    @Autowired
    UserRepository userRepository;

    public int registerUser(SiggUser siggUser){
        userRepository.save(siggUser);
        return 0;
    }

}
