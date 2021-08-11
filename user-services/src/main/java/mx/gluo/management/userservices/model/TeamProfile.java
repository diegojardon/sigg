package mx.gluo.management.userservices.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class TeamProfile {

    private Long id;
    private String completeName;
    private String googleSheetId;
}
