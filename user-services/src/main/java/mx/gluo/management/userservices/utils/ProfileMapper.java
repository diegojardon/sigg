package mx.gluo.management.userservices.utils;

import mx.gluo.management.userservices.entity.SiggUser;
import mx.gluo.management.userservices.model.Profile;

public class ProfileMapper {

    public static void mapSiggUserToProfile(Profile profile, SiggUser siggUser){
        profile.setId(siggUser.getId());
        profile.setCompleteName(siggUser.getCompleteName());
        profile.setBirthDate(siggUser.getBirthDate());
        profile.setAdmissionDate(siggUser.getAdmissionDate());
    }
}
