package gestionparcautomobile.demo.Models;

import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "ChauffeurMissions")
public class ChauffeurMission {
    @DBRef
    private Mission refMission;
    @DBRef
    private Vehicule refVehicule;
    @DBRef
    private Personne refPersonne;

    public ChauffeurMission() {
    }

    public Mission getRefMission() {
        return refMission;
    }

    public void setRefMission(Mission refMission) {
        this.refMission = refMission;
    }

    public Vehicule getRefVehicule() {
        return refVehicule;
    }

    public void setRefVehicule(Vehicule refVehicule) {
        this.refVehicule = refVehicule;
    }

    public Personne getRefPersonne() {
        return refPersonne;
    }

    public void setRefPersonne(Personne refPersonne) {
        this.refPersonne = refPersonne;
    }

    public ChauffeurMission(Mission refMission, Vehicule refVehicule, Personne refPersonne) {
        this.refMission = refMission;
        this.refVehicule = refVehicule;
        this.refPersonne = refPersonne;
    }
}
