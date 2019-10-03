package gestionparcautomobile.demo.Models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Positions")
public class Position {
    @Id
    private String id;
    @DBRef
    private Vehicule refVehicule;
    @DBRef
    private Parking refParking;

    public Position() {
    }

    public Position(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Vehicule getRefVehicule() {
        return refVehicule;
    }

    public void setRefVehicule(Vehicule refVehicule) {
        this.refVehicule = refVehicule;
    }

    public Parking getRefParking() {
        return refParking;
    }

    public void setRefParking(Parking refParking) {
        this.refParking = refParking;
    }

    public Position(Vehicule refVehicule, Parking refParking) {
        this.refVehicule = refVehicule;
        this.refParking = refParking;
    }
}
