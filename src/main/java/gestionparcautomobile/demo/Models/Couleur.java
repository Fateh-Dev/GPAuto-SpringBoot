package gestionparcautomobile.demo.Models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Couleurs")
public class Couleur {
    @Id
    private String id;
    private String designationFr;
    private String designationAr;

    public Couleur() {
    }

    public Couleur(String designationFr, String designationAr) {
        this.designationFr = designationFr;
        this.designationAr = designationAr;
    }

    public Couleur(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDesignationFr() {
        return designationFr;
    }

    public void setDesignationFr(String designationFr) {
        this.designationFr = designationFr;
    }

    public String getDesignationAr() {
        return designationAr;
    }

    public void setDesignationAr(String designationAr) {
        this.designationAr = designationAr;
    }
}
