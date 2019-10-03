package gestionparcautomobile.demo.Models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
@Document(collection = "Assurances")
public class Assurance {
    @Id
    private String id;
    private Date dateDebut;
    private Date dateExpiration;
    private String entreprise;

    public Assurance() {
    }

    public Assurance(String id) {
        this.id = id;
    }

    public Assurance(Date dateDebut, Date dateExpiration, String entreprise) {
        this.dateDebut = dateDebut;
        this.dateExpiration = dateExpiration;
        this.entreprise = entreprise;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }

    public Date getDateExpiration() {
        return dateExpiration;
    }

    public void setDateExpiration(Date dateExpiration) {
        this.dateExpiration = dateExpiration;
    }

    public String getEntreprise() {
        return entreprise;
    }

    public void setEntreprise(String entreprise) {
        this.entreprise = entreprise;
    }

}
