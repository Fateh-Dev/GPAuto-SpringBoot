package gestionparcautomobile.demo.Interfaces;

import gestionparcautomobile.demo.Models.Assurance;
import gestionparcautomobile.demo.Models.Model;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ModelRepository extends MongoRepository<Model,String> {
    Optional<Model> findById(String id);
}
