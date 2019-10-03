package gestionparcautomobile.demo.Models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Collection;
import java.util.List;

@Document(collection = "Vehicules")
public class Vehicule {
    @Id
    private String id;
    private String matricule;
    private Integer nombrePlace;
    @DBRef
    private Etat refEtat;
    @DBRef
    private Categorie refCategorie;
    @DBRef
    private Position refPosition;
    @DBRef
    private List<ControlTech> refControlTech;
    @DBRef
    private List<Assurance> refAssurence;
    @DBRef
    private List<Vidange> refVidange;
    @DBRef
    private Marque refMarque;
    @DBRef
    private Couleur refCouleur;


    public Vehicule(String id) {
        this.id = id;
    }
    public Vehicule() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public Integer getNombrePlace() {
        return nombrePlace;
    }

    public void setNombrePlace(Integer nombrePlace) {
        this.nombrePlace = nombrePlace;
    }

    public Etat getRefEtat() {
        return refEtat;
    }

    public void setRefEtat(Etat refEtat) {
        this.refEtat = refEtat;
    }

    public Categorie getRefCategorie() {
        return refCategorie;
    }

    public void setRefCategorie(Categorie refCategorie) {
        this.refCategorie = refCategorie;
    }

    public Position getRefPosition() {
        return refPosition;
    }

    public void setRefPosition(Position refPosition) {
        this.refPosition = refPosition;
    }

    public List<ControlTech> getRefControlTech() {
        return refControlTech;
    }

    public void setRefControlTech(List<ControlTech> refControlTech) {
        this.refControlTech = refControlTech;
    }

    public List<Assurance> getRefAssurence() {
        return refAssurence;
    }

    public void setRefAssurence(List<Assurance> refAssurence) {
        this.refAssurence = refAssurence;
    }

    public List<Vidange> getRefVidange() {
        return refVidange;
    }

    public void setRefVidange(List<Vidange> refVidange) {
        this.refVidange = refVidange;
    }

    public Marque getRefMarque() {
        return refMarque;
    }

    public void setRefMarque(Marque refMarque) {
        this.refMarque = refMarque;
    }

    public Couleur getRefCouleur() {
        return refCouleur;
    }

    public void setRefCouleur(Couleur refCouleur) {
        this.refCouleur = refCouleur;
    }

    public Vehicule(String matricule, Integer nombrePlace, Etat refEtat, Categorie refCategorie, Position refPosition, List<ControlTech> refControlTech, List<Assurance> refAssurence, List<Vidange> refVidange, Marque refMarque, Couleur refCouleur) {
        this.matricule = matricule;
        this.nombrePlace = nombrePlace;
        this.refEtat = refEtat;
        this.refCategorie = refCategorie;
        this.refPosition = refPosition;
        this.refControlTech = refControlTech;
        this.refAssurence = refAssurence;
        this.refVidange = refVidange;
        this.refMarque = refMarque;
        this.refCouleur = refCouleur;
    }
}
