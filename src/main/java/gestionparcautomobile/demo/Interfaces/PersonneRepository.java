package gestionparcautomobile.demo.Interfaces;

import gestionparcautomobile.demo.Models.Assurance;
import gestionparcautomobile.demo.Models.Personne;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PersonneRepository extends MongoRepository<Personne,String> {
    Optional<Personne> findById(String id);}
