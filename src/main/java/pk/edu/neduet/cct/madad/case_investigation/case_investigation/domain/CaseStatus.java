package pk.edu.neduet.cct.madad.case_investigation.case_investigation.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CaseStatus {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)

    private int Case_id;

    private String Case_status;
}
