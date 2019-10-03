package gestionparcautomobile.demo.Controllers;

import gestionparcautomobile.demo.Interfaces.TypePanneRepository;
import gestionparcautomobile.demo.Interfaces.VehiculeRepository;
import gestionparcautomobile.demo.Models.TypePanne;
import gestionparcautomobile.demo.Models.Vehicule;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/Vehicules")
public class VehiculeController {
    private VehiculeRepository vehiculeRepository;

    public VehiculeController(VehiculeRepository vehiculeRepository) {
        this.vehiculeRepository = vehiculeRepository;
    }

    @GetMapping("/all")
    public List<Vehicule> getAll(){
        List<Vehicule> vehicules=this.vehiculeRepository.findAll();
        return vehicules;
    }

    @PutMapping
    public void insert(@RequestBody Vehicule vehicule){
        this.vehiculeRepository.insert(vehicule);
    }
    @PostMapping
    public void update(@RequestBody Vehicule vehicule){
        this.vehiculeRepository.save(vehicule);
    }
    @DeleteMapping("/Delete/{id}")
    public void delete(@PathVariable("id") String id){
        this.vehiculeRepository.deleteById(id);
    }

    @GetMapping("/find/{id}")
    public Optional<Vehicule> findById(@PathVariable("id") String id){
        Optional<Vehicule> vehicule=this.vehiculeRepository.findById(id);
        return vehicule;

    }
}
