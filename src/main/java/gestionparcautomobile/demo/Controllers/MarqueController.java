package gestionparcautomobile.demo.Controllers;

import gestionparcautomobile.demo.Interfaces.MarqueRepository;
import gestionparcautomobile.demo.Models.Marque;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/Marques")
public class MarqueController {
    private MarqueRepository marqueRepository;
    public MarqueController(MarqueRepository marqueRepository) {
        this.marqueRepository = marqueRepository;
    }
    @GetMapping("/all")
    public List<Marque> getAll(){
        List<Marque> marques=this.marqueRepository.findAll();
        return marques; }
    @PutMapping
    public void insert(@RequestBody Marque marque){
        this.marqueRepository.insert(marque);
    }
    @PostMapping
    public void update(@RequestBody Marque marque){
        this.marqueRepository.save(marque);
    }
    @DeleteMapping("/Delete/{id}")
    public void delete(@PathVariable("id") String id){
        this.marqueRepository.deleteById(id);
    }
    @GetMapping("/find/{id}")
    public Optional<Marque> findById(@PathVariable("id") String id){
        Optional<Marque> marque=this.marqueRepository.findById(id);
        return marque;
    }
}
