package gestionparcautomobile.demo.Interfaces;

import gestionparcautomobile.demo.Models.Assurance;
import gestionparcautomobile.demo.Models.ChauffeurMission;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ChauffeurMissionRepository extends MongoRepository<ChauffeurMission,String> {
    Optional<ChauffeurMission> findById(String id);
}
