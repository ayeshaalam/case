package pk.edu.neduet.cct.madad.case_investigation.case_investigation.domain;

import org.apache.tomcat.jni.Time;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Past;
import java.util.Calendar;
import java.util.Date;

@Entity
public class MissingChildCase {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)

    private int Case_id;

    private int Igp_id;

    private long User_id;

    @Temporal(TemporalType.TIMESTAMP)
    private Date Reg_date;

    private String Child_first_name;

    private String Child_last_name;

    private String Child_age;

    private String Child_gender;

    @Past
    @Temporal(TemporalType.DATE)
    private Calendar Child_dob;

    private String Child_language;
    private String Child_last_seen_place;

    @Temporal(TemporalType.TIME)
    private Time Child_last_seen_time;

    private String Child_last_seen_clothes;

    @Past
    @Temporal(TemporalType.DATE)
    private Calendar Child_last_seen_date;

    private float Child_height;
    private float Child_weight;

    @Max(12)
    private String Child_eye_color;

    @Max(12)
    private String Child_hair_color;

    @Lob
    private byte Child_photo;


}



