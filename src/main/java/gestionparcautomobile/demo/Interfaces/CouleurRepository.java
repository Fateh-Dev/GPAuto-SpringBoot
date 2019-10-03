package gestionparcautomobile.demo.Interfaces;

import gestionparcautomobile.demo.Models.Couleur;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CouleurRepository extends MongoRepository<Couleur,String> {
    Optional<Couleur> findById(String id);
    List<Couleur> findBydesignationFrEquals(String Des);

}
