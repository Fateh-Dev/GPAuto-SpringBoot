package gestionparcautomobile.demo.Interfaces;

import gestionparcautomobile.demo.Models.Assurance;
import gestionparcautomobile.demo.Models.DatePanne;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DatePanneRepository extends MongoRepository<DatePanne,String> {
    Optional<DatePanne> findById(String id);}
