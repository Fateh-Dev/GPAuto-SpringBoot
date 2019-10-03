package gestionparcautomobile.demo.Controllers;

import gestionparcautomobile.demo.Interfaces.FonctionRepository;
import gestionparcautomobile.demo.Interfaces.MarqueRepository;
import gestionparcautomobile.demo.Models.Fonction;
import gestionparcautomobile.demo.Models.Marque;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/Fonctions")
public class FonctionController {
    private FonctionRepository fonctionRepository;


    public FonctionController(FonctionRepository fonctionRepository) {
        this.fonctionRepository = fonctionRepository;
    }

    @GetMapping("/all")
    public List<Fonction> getAll(){
        List<Fonction> fonctions=this.fonctionRepository.findAll();
        return fonctions;
    }

    @PutMapping
    public void insert(@RequestBody Fonction fonction){
        this.fonctionRepository.insert(fonction);
    }
    @PostMapping
    public void update(@RequestBody Fonction fonction){
        this.fonctionRepository.save(fonction);
    }
    @DeleteMapping("/Delete/{id}")
    public void delete(@PathVariable("id") String id){
        this.fonctionRepository.deleteById(id);
    }

    @GetMapping("/find/{id}")
    public Optional<Fonction> findById(@PathVariable("id") String id){
        Optional<Fonction> fonction=this.fonctionRepository.findById(id);
        return fonction;

    }
}
