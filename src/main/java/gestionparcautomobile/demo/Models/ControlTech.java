package gestionparcautomobile.demo.Models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
@Document(collection = "ControlTechs")
public class ControlTech {
    @Id
    private String id;
    private Date dateControl;

    public ControlTech() {
    }

    public ControlTech(Date dateControl) {
        this.dateControl = dateControl;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getDateControl() {
        return dateControl;
    }

    public void setDateControl(Date dateControl) {
        this.dateControl = dateControl;
    }


}
