package pk.edu.neduet.cct.madad.case_investigation.case_investigation.domain;

import javax.persistence.*;



@Entity
public class Igp {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO )

    private long Igp_id;

    private String Igp_first_name;

    private String Igp_last_name;

    private String Igp_password;

    private String Province_territory;

    public Igp(String igp_first_name, String igp_last_name, String igp_password, String province_territory) {
        Igp_first_name = igp_first_name;
        Igp_last_name = igp_last_name;
        Igp_password = igp_password;
        Province_territory = province_territory;
    }
}
