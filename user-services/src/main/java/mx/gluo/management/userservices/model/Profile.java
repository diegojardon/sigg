package mx.gluo.management.userservices.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import mx.gluo.management.userservices.entity.Project;

import java.util.List;

@Data
@NoArgsConstructor
public class Profile {

    private Long id;
    private String completeName;
    private String birthDate;
    private String admissionDate;
    private String googleSheetId;
    private String jobName;
    private List<Project> projects;
    private List<TeamProfile> team;

}
