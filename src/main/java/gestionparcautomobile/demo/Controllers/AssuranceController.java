package gestionparcautomobile.demo.Controllers;

import gestionparcautomobile.demo.Interfaces.AssuranceRepository;
import gestionparcautomobile.demo.Models.Assurance;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/Assurances")
public class AssuranceController {
    private AssuranceRepository assuranceRepository;
    public AssuranceController(AssuranceRepository assuranceRepository) {
        this.assuranceRepository = assuranceRepository;
    }

    @GetMapping("/all")
    public List<Assurance> getAll(){
        List<Assurance> assurance=this.assuranceRepository.findAll();
        return assurance;
    }

    @PutMapping
    public void insert(@RequestBody Assurance assurance){
        this.assuranceRepository.insert(assurance);
    }
    @PostMapping
    public void update(@RequestBody Assurance assurance){
        this.assuranceRepository.save(assurance);
    }
    @DeleteMapping("/Delete/{id}")
    public void delete(@PathVariable("id") String id){
        this.assuranceRepository.deleteById(id);
    }

    @GetMapping("/find/{id}")
    public Optional<Assurance> findById(@PathVariable("id") String id){
        Optional<Assurance> assurance=this.assuranceRepository.findById(id);
        return assurance;
    }
}
