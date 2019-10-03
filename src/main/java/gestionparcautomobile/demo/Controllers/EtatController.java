package gestionparcautomobile.demo.Controllers;

import gestionparcautomobile.demo.Interfaces.EtatRepository;
import gestionparcautomobile.demo.Interfaces.MarqueRepository;
import gestionparcautomobile.demo.Models.Etat;
import gestionparcautomobile.demo.Models.Marque;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/Etats")
public class EtatController {
    private EtatRepository etatRepository;

    public EtatController(EtatRepository etatRepository) {
        this.etatRepository = etatRepository;
    }

    @GetMapping("/all")
    public List<Etat> getAll(){
        List<Etat> etats=this.etatRepository.findAll();
        return etats;
    }

    @PutMapping
    public void insert(@RequestBody Etat etat){
        this.etatRepository.insert(etat);
    }
    @PostMapping
    public void update(@RequestBody Etat etat){
        this.etatRepository.save(etat);
    }
    @DeleteMapping("/Delete/{id}")
    public void delete(@PathVariable("id") String id){
        this.etatRepository.deleteById(id);
    }

    @GetMapping("/find/{id}")
    public Optional<Etat> findById(@PathVariable("id") String id){
        Optional<Etat> etat=this.etatRepository.findById(id);
        return etat;

    }
}
