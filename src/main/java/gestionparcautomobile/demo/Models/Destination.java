package gestionparcautomobile.demo.Models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Destinations")
public class Destination {
    @Id
    private String id;
    private String designationFr;
    private String designationAr;

    public Destination(String id) {
        this.id = id;
    }

    public Destination() {
    }

    public Destination(String designationFr, String designationAr) {
        this.designationFr = designationFr;
        this.designationAr = designationAr;
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

    public String getDestignationAr() {
        return designationAr;
    }

    public void setDestignationAr(String destignaionAr) {
        this.designationAr = designationAr;
    }
}
