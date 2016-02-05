package models;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by xing on 4/15/15.
 */
@Entity
public class ServiceEntry {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE})
    @JoinColumn(name = "serviceId", referencedColumnName = "id")
    private ClimateService climateService;
    private String versionNo;
    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE})
    @JoinColumn(name = "registorId", referencedColumnName = "id")
    private User user;
    @Temporal(TemporalType.TIMESTAMP)
    private Date registerTimeStamp;
    private String registerNote;
    private int count;
    @Temporal(TemporalType.TIMESTAMP)
    private Date latestAccessTimeStamp;

    public ServiceEntry(){
    }

    public ServiceEntry(Date latestAccessTimestamp, String versionNo, User user, Date registerTimeStamp, String registerNote, int count, ClimateService climateService) {
        super();
        if (latestAccessTimestamp == null)
            latestAccessTimestamp = new Date();
        this.latestAccessTimeStamp = latestAccessTimestamp;
        this.versionNo = versionNo;
        this.user = user;
        if (registerTimeStamp == null)
            registerTimeStamp = new Date();
        this.registerTimeStamp = registerTimeStamp;
        this.registerNote = registerNote;
        this.count = count;
        this.climateService = climateService;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public ClimateService getClimateService() {
        return climateService;
    }

    public void setClimateService(ClimateService climateService) {
        this.climateService = climateService;
    }

    public String getVersionNo() {
        return versionNo;
    }

    public void setVersionNo(String versionNo) {
        this.versionNo = versionNo;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Date getRegisterTimeStamp() {
        return registerTimeStamp;
    }

    public void setRegisterTimeStamp(Date registerTimeStamp) {
        this.registerTimeStamp = registerTimeStamp;
    }

    public String getRegisterNote() {
        return registerNote;
    }

    public void setRegisterNote(String registerNote) {
        this.registerNote = registerNote;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Date getLatestAccessTimestamp() {
        return latestAccessTimeStamp;
    }

    public void setLatestAccessTimestamp(Date latestAccessTimestamp) {
        this.latestAccessTimeStamp = latestAccessTimestamp;
    }

    public String toString(){
        return "ServiceEntry [id=" + id + ", service=" + climateService
                + ", version=" + versionNo + ", user=" + user + ", registerTimeStamp=" + registerTimeStamp
                + ", registerNote=" + registerNote + ", count=" + count + ", latestAccessTimeStamp="
                + latestAccessTimeStamp + "]";
    }
}
