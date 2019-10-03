package gestionparcautomobile.demo.Models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Pannes")
public class Panne {
    @Id
    private String id;
    private String descriptionFr;
    private String descriptionAr;
    @DBRef
    private TypePanne refTypePanne;

    public Panne() {
    }

    public Panne(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescriptionFr() {
        return descriptionFr;
    }

    public void setDescriptionFr(String descriptionFr) {
        this.descriptionFr = descriptionFr;
    }

    public String getDescriptionAr() {
        return descriptionAr;
    }

    public void setDescriptionAr(String descriptionAr) {
        this.descriptionAr = descriptionAr;
    }

    public TypePanne getRefTypePanne() {
        return refTypePanne;
    }

    public void setRefTypePanne(TypePanne refTypePanne) {
        this.refTypePanne = refTypePanne;
    }

    public Panne(String descriptionFr, String descriptionAr, TypePanne refTypePanne) {
        this.descriptionFr = descriptionFr;
        this.descriptionAr = descriptionAr;
        this.refTypePanne = refTypePanne;
    }
}
