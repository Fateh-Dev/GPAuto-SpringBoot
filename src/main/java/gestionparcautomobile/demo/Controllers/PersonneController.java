package gestionparcautomobile.demo.Controllers;

import gestionparcautomobile.demo.Interfaces.ParkingRepository;
import gestionparcautomobile.demo.Interfaces.PersonneRepository;
import gestionparcautomobile.demo.Models.Parking;
import gestionparcautomobile.demo.Models.Personne;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/Personnes")
public class PersonneController {
    private PersonneRepository personneRepository ;

    public PersonneController(PersonneRepository personneRepository) {
        this.personneRepository = personneRepository;
    }

    @GetMapping("/all")
    public List<Personne> getAll(){
        List<Personne> personnes=this.personneRepository.findAll();
        return personnes;
    }

    @PutMapping
    public void insert(@RequestBody Personne personne){
        this.personneRepository.insert(personne);
    }
    @PostMapping
    public void update(@RequestBody Personne personne){
        this.personneRepository.save(personne);
    }
    @DeleteMapping("/Delete/{id}")
    public void delete(@PathVariable("id") String id){
        this.personneRepository.deleteById(id);
    }

    @GetMapping("/find/{id}")
    public Optional<Personne> findById(@PathVariable("id") String id){
        Optional<Personne> personne=this.personneRepository.findById(id);
        return personne;

    }
}
