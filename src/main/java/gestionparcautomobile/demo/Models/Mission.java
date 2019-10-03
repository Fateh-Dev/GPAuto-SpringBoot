package gestionparcautomobile.demo.Models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.aggregation.DateOperators;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
@Document(collection = "Missions")
public class Mission {
    @Id
    private String numMission;
    private Date dateMission;
    private DateOperators.Hour heurMission;
    private String description;
    @DBRef
    private Personne refPersonne;
    @DBRef
    private Destination refDestination;

    public Mission() {
    }

    public Mission(String numMission) {
        this.numMission = numMission;
    }

    public String getNumMission() {
        return numMission;
    }

    public void setNumMission(String numMission) {
        this.numMission = numMission;
    }

    public Date getDateMission() {
        return dateMission;
    }

    public void setDateMission(Date dateMission) {
        this.dateMission = dateMission;
    }

    public DateOperators.Hour getHeurMission() {
        return heurMission;
    }

    public void setHeurMission(DateOperators.Hour heurMission) {
        this.heurMission = heurMission;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Personne getRefPersonne() {
        return refPersonne;
    }

    public void setRefPersonne(Personne refPersonne) {
        this.refPersonne = refPersonne;
    }

    public Destination getRefDestination() {
        return refDestination;
    }

    public void setRefDestination(Destination refDestination) {
        this.refDestination = refDestination;
    }

    public Mission(String numMission, Date dateMission, DateOperators.Hour heurMission, String description, Personne refPersonne, Destination refDestination) {
        this.numMission = numMission;
        this.dateMission = dateMission;
        this.heurMission = heurMission;
        this.description = description;
        this.refPersonne = refPersonne;
        this.refDestination = refDestination;
    }
}
