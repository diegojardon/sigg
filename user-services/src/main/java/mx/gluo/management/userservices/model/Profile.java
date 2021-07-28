package mx.gluo.management.userservices.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Profile {

    private Long id;
    private String completeName;
    private String birthDate;
    private String admissionDate;
    private String googleSheetId;
}
