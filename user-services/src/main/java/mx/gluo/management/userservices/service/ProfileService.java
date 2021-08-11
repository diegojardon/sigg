package mx.gluo.management.userservices.service;

import mx.gluo.management.userservices.entity.Job;
import mx.gluo.management.userservices.entity.Project;
import mx.gluo.management.userservices.entity.SiggUser;
import mx.gluo.management.userservices.model.Profile;
import mx.gluo.management.userservices.repository.JobRepository;
import mx.gluo.management.userservices.repository.ProjectRepository;
import mx.gluo.management.userservices.repository.UserRepository;
import mx.gluo.management.userservices.utils.ProfileMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProfileService {

    @Autowired
    UserRepository userRepository;

    @Autowired
    ProjectRepository projectRepository;

    @Autowired
    JobRepository jobRepository;

    public Profile getUserProfile(String username, String roles){

        Profile profile = new Profile();
        SiggUser siggUser = userRepository.findByUsername(username);
        ProfileMapper.mapSiggUserToProfile(profile, siggUser);

        List<Project> userProjects = projectRepository.findProjectsByUserId(siggUser.getId());
        profile.setProjects(userProjects);

        Optional<Job> jobOptional = jobRepository.findById(siggUser.getJobId());
        if(jobOptional.isPresent())
            profile.setJobName(jobOptional.get().getName());

        if(roles.contains("ADMIN")) {
            List<SiggUser> userTeam = userRepository.findUsersByProject(siggUser.getId());
            ProfileMapper.mapTeamToProfile(profile, userTeam);
        }

        return profile;
    }

}
