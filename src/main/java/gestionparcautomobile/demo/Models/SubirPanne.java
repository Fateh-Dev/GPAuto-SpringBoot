package gestionparcautomobile.demo.Models;

import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "SubirPanne")
public class SubirPanne {
    @DBRef
    private Panne refPanne;
    @DBRef
    private DatePanne refDatePanne;
    @DBRef
    private Vehicule refVehicule;

    public SubirPanne() {
    }

    public Panne getRefPanne() {
        return refPanne;
    }

    public void setRefPanne(Panne refPanne) {
        this.refPanne = refPanne;
    }

    public DatePanne getRefDatePanne() {
        return refDatePanne;
    }

    public void setRefDatePanne(DatePanne refDatePanne) {
        this.refDatePanne = refDatePanne;
    }

    public Vehicule getRefVehicule() {
        return refVehicule;
    }

    public void setRefVehicule(Vehicule refVehicule) {
        this.refVehicule = refVehicule;
    }

    public SubirPanne(Panne refPanne, DatePanne refDatePanne, Vehicule refVehicule) {
        this.refPanne = refPanne;
        this.refDatePanne = refDatePanne;
        this.refVehicule = refVehicule;
    }
}
