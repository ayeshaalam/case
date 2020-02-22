package pk.edu.neduet.cct.madad.case_investigation.case_investigation.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Area {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)

    private int Area_id;

    private String Area_province;

    private String Area_district;

    private String Area_sub_district;

    private String Province_territory;

}
