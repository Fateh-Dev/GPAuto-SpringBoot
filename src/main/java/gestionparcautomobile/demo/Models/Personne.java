package gestionparcautomobile.demo.Models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
@Document(collection = "Personne")
public class Personne {
    @Id
    private String id;
    private String nomFr;
    private String prenomFr;
    private String nomAr;
    private String prenomAr;
    private Integer age;
    private String sexe;
    private Date dateNaissance;
    @DBRef
    private Fonction refFonction;

    public Personne() {
    }

    public Personne(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNomFr() {
        return nomFr;
    }

    public void setNomFr(String nomFr) {
        this.nomFr = nomFr;
    }

    public String getPrenomFr() {
        return prenomFr;
    }

    public void setPrenomFr(String prenomFr) {
        this.prenomFr = prenomFr;
    }

    public String getNomAr() {
        return nomAr;
    }

    public void setNomAr(String nomAr) {
        this.nomAr = nomAr;
    }

    public String getPrenomAr() {
        return prenomAr;
    }

    public void setPrenomAr(String prenomAr) {
        this.prenomAr = prenomAr;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public Date getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public Fonction getRefFonction() {
        return refFonction;
    }

    public void setRefFonction(Fonction refFonction) {
        this.refFonction = refFonction;
    }

    public Personne(String id, String nomFr, String prenomFr, String nomAr, String prenomAr, Integer age, String sexe, Date dateNaissance, Fonction refFonction) {
        this.id = id;
        this.nomFr = nomFr;
        this.prenomFr = prenomFr;
        this.nomAr = nomAr;
        this.prenomAr = prenomAr;
        this.age = age;
        this.sexe = sexe;
        this.dateNaissance = dateNaissance;
        this.refFonction = refFonction;
    }
}
