package mx.gluo.management.userservices.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity(name = "USER")
public class SiggUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String password;
    private String completeName;
    private String birthDate;
    private String admissionDate;
    private String googleSheetId;
    private Long areaId;
    private Long jobId;
}