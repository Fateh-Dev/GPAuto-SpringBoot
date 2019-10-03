package gestionparcautomobile.demo.Interfaces;

import gestionparcautomobile.demo.Models.Couleur;
import gestionparcautomobile.demo.Models.Marque;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MarqueRepository extends MongoRepository<Marque,String> {
    Optional<Marque> findById(String id);
}
