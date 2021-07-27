package mx.gluo.management.userservices.service;

import mx.gluo.management.userservices.entity.SiggUser;
import mx.gluo.management.userservices.model.Profile;
import mx.gluo.management.userservices.repository.UserRepository;
import mx.gluo.management.userservices.utils.ProfileMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProfileService {

    @Autowired
    UserRepository userRepository;

    public Profile getUserProfile(String username){

        Profile profile = new Profile();
        SiggUser siggUser = userRepository.findByUsername(username);
        ProfileMapper.mapSiggUserToProfile(profile, siggUser);
        return profile;
    }

}
