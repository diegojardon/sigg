package mx.gluo.management.authorizationservice.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@NoArgsConstructor
@Entity(name = "ROLE")
public class SiggRole {

    @Id
    private Long id;
    private String role;

}
