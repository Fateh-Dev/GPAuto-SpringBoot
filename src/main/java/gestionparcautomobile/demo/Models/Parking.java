package gestionparcautomobile.demo.Models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Parkings")
public class Parking {
    @Id
    private String id;
    private Integer capacite;

    public Parking() {
    }

    public Parking(Integer capacite) {
        this.capacite = capacite;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getCapacite() {
        return capacite;
    }

    public void setCapacite(Integer capacite) {
        this.capacite = capacite;
    }
}
