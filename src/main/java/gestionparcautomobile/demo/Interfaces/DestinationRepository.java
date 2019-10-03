package gestionparcautomobile.demo.Interfaces;

import gestionparcautomobile.demo.Models.Couleur;
import gestionparcautomobile.demo.Models.Destination;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DestinationRepository extends MongoRepository<Destination,String> {
    Optional<Destination> findById(String id);
}
