package gestionparcautomobile.demo.Interfaces;

import gestionparcautomobile.demo.Models.Assurance;
import gestionparcautomobile.demo.Models.Etat;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EtatRepository extends MongoRepository<Etat,String> {
    Optional<Etat> findById(String id);}
