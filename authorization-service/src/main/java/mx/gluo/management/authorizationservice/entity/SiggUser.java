package mx.gluo.management.authorizationservice.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@NoArgsConstructor
@Entity(name = "USER")
public class SiggUser {

    @Id
    private Long id;
    private String username;
    private String password;
    private String completeName;
    private String birthDate;
    private String admissionDate;
    private String googleSheetId;
    private int areaId;
    private int jobId;
}
