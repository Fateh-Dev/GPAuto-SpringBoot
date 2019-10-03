package gestionparcautomobile.demo.Controllers;

import gestionparcautomobile.demo.Interfaces.VehiculeRepository;
import gestionparcautomobile.demo.Interfaces.VidangeRepository;
import gestionparcautomobile.demo.Models.Vehicule;
import gestionparcautomobile.demo.Models.Vidange;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/Vidanges")
public class VidangeController {
    private VidangeRepository vidangeRepository;

    public VidangeController(VidangeRepository vidangeRepository) {
        this.vidangeRepository = vidangeRepository;
    }

    @GetMapping("/all")
    public List<Vidange> getAll(){
        List<Vidange> vidanges=this.vidangeRepository.findAll();
        return vidanges;
    }

    @PutMapping
    public void insert(@RequestBody Vidange vidanges){
        this.vidangeRepository.insert(vidanges);
    }
    @PostMapping
    public void update(@RequestBody Vidange vidanges){
        this.vidangeRepository.save(vidanges);
    }
    @DeleteMapping("/Delete/{id}")
    public void delete(@PathVariable("id") String id){
        this.vidangeRepository.deleteById(id);
    }

    @GetMapping("/find/{id}")
    public Optional<Vidange> findById(@PathVariable("id") String id){
        Optional<Vidange> vidanges=this.vidangeRepository.findById(id);
        return vidanges;

    }
}
