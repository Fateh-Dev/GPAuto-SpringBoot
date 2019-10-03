package gestionparcautomobile.demo.Controllers;

import gestionparcautomobile.demo.Interfaces.DestinationRepository;
import gestionparcautomobile.demo.Interfaces.MarqueRepository;
import gestionparcautomobile.demo.Models.Destination;
import gestionparcautomobile.demo.Models.Marque;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@RestController
@RequestMapping("/Destinations")
public class DestinationController {
    private DestinationRepository destinationRepository;

    public DestinationController(DestinationRepository destinationRepository) {
        this.destinationRepository = destinationRepository;
    }

    @GetMapping("/all")
    public List<Destination> getAll(){
        List<Destination> destination=this.destinationRepository.findAll();
        return destination;
    }

    @PutMapping
    public void insert(@RequestBody Destination destination){
        this.destinationRepository.insert(destination);
    }
    @PostMapping
    public void update(@RequestBody Destination destination){
        this.destinationRepository.save(destination);
    }
    @DeleteMapping("/Delete/{id}")
    public void delete(@PathVariable("id") String id){
        this.destinationRepository.deleteById(id);
    }

    @GetMapping("/find/{id}")
    public Optional<Destination> findById(@PathVariable("id") String id){
        Optional<Destination> destination=this.destinationRepository.findById(id);
        return destination;

    }
}
