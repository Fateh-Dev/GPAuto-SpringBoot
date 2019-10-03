package gestionparcautomobile.demo.Controllers;

import gestionparcautomobile.demo.Interfaces.CouleurRepository;
import gestionparcautomobile.demo.Models.Couleur;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/Couleurs")
public class CouleurController {
    private CouleurRepository couleurRepository;

    public CouleurController(CouleurRepository couleurRepository) {
        this.couleurRepository = couleurRepository;
    }

    @GetMapping("/all")
    public List<Couleur> getAll(){
        List<Couleur> couleurs=this.couleurRepository.findAll();
        return couleurs;
    }

    @PutMapping
    public void insert(@RequestBody Couleur couleur){
        this.couleurRepository.insert(couleur);
    }
    @PostMapping
    public void update(@RequestBody Couleur couleur){
        this.couleurRepository.save(couleur);
    }
    @DeleteMapping("/Delete/{id}")
    public void delete(@PathVariable("id") String id){
        this.couleurRepository.deleteById(id);
    }

    @GetMapping("/find/{id}")
    public Optional<Couleur> findById(@PathVariable("id") String id){
        Optional<Couleur> color=this.couleurRepository.findById(id);
        return color;

    }


     @GetMapping("/findDes/{Des}")
     public List<Couleur> findByDesignationFr(@PathVariable("Des") String Des){
        List<Couleur> allColors=this.couleurRepository.findBydesignationFrEquals(Des);
        return allColors;

     }
}
