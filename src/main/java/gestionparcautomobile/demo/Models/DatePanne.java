package gestionparcautomobile.demo.Models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
@Document(collection = "DatePannes")
public class DatePanne {
    @Id
    private String id;
    private Date datePanne;

    public DatePanne() {
    }

    public DatePanne(Date datePanne) {
        this.datePanne = datePanne;
    }

    public DatePanne(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getDatePanne() {
        return datePanne;
    }

    public void setDatePanne(Date datePanne) {
        this.datePanne = datePanne;
    }
}
