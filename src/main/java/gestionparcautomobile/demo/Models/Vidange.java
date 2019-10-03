package gestionparcautomobile.demo.Models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
@Document(collection = "Vidanges")
public class Vidange {
    @Id
    private String id;
    private Date dateVidange;
    private Integer kilometrage;

    public Vidange() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getDateVidange() {
        return dateVidange;
    }

    public void setDateVidange(Date dateVidange) {
        this.dateVidange = dateVidange;
    }

    public Integer getKilometrage() {
        return kilometrage;
    }

    public void setKilometrage(Integer kilometrage) {
        this.kilometrage = kilometrage;
    }

    public Vidange(Date dateVidange, Integer kilometrage) {
        this.dateVidange = dateVidange;
        this.kilometrage = kilometrage;
    }
}
