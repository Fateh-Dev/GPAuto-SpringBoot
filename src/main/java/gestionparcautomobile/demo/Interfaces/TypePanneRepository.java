package gestionparcautomobile.demo.Interfaces;

import gestionparcautomobile.demo.Models.Assurance;
import gestionparcautomobile.demo.Models.TypePanne;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TypePanneRepository extends MongoRepository<TypePanne,String> {
    Optional<TypePanne> findById(String id);}
