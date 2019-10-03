package gestionparcautomobile.demo.Controllers;

import gestionparcautomobile.demo.Interfaces.ModelRepository;
import gestionparcautomobile.demo.Interfaces.PanneRepository;
import gestionparcautomobile.demo.Models.Model;
import gestionparcautomobile.demo.Models.Panne;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/Pannes")
public class PanneController {
    private PanneRepository panneRepository;

    public PanneController(PanneRepository panneRepository) {
        this.panneRepository = panneRepository;
    }

    @GetMapping("/all")
    public List<Panne> getAll(){
        List<Panne> models=this.panneRepository.findAll();
        return models;
    }

    @PutMapping
    public void insert(@RequestBody Panne panne){
        this.panneRepository.insert(panne);
    }
    @PostMapping
    public void update(@RequestBody Panne panne){
        this.panneRepository.save(panne);
    }
    @DeleteMapping("/Delete/{id}")
    public void delete(@PathVariable("id") String id){
        this.panneRepository.deleteById(id);
    }

    @GetMapping("/find/{id}")
    public Optional<Panne> findById(@PathVariable("id") String id){
        Optional<Panne> panne=this.panneRepository.findById(id);
        return panne;

    }
}
