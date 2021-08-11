package mx.gluo.management.userservices.utils;

import mx.gluo.management.userservices.entity.SiggUser;
import mx.gluo.management.userservices.model.Profile;
import mx.gluo.management.userservices.model.TeamProfile;

import java.util.ArrayList;
import java.util.List;

public class ProfileMapper {

    public static void mapSiggUserToProfile(Profile profile, SiggUser siggUser){
        profile.setId(siggUser.getId());
        profile.setCompleteName(siggUser.getCompleteName());
        profile.setBirthDate(siggUser.getBirthDate());
        profile.setAdmissionDate(siggUser.getAdmissionDate());
        profile.setGoogleSheetId(siggUser.getGoogleSheetId());
    }

    public static void mapTeamToProfile(Profile profile, List<SiggUser> userTeam){
        List<TeamProfile> teamMembers = new ArrayList<>();
        userTeam.forEach(member -> {
            TeamProfile teamProfile = new TeamProfile();
            teamProfile.setId(member.getId());
            teamProfile.setCompleteName(member.getCompleteName());
            teamProfile.setGoogleSheetId(member.getGoogleSheetId());
            teamMembers.add(teamProfile);
        });
        profile.setTeam(teamMembers);
    }
}
