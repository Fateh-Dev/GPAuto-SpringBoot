package gestionparcautomobile.demo.Interfaces;

import gestionparcautomobile.demo.Models.Categorie;
import gestionparcautomobile.demo.Models.Couleur;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CategorieRepository extends MongoRepository<Categorie,String> {
    Optional<Categorie> findById(String id);
}
