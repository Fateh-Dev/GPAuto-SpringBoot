package gestionparcautomobile.demo.Controllers;

import gestionparcautomobile.demo.Interfaces.CategorieRepository;
import gestionparcautomobile.demo.Models.Categorie;
import gestionparcautomobile.demo.Models.Marque;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@RestController
@RequestMapping("/Categories")
public class CategorieController {
    private CategorieRepository categorieRepository;

    public CategorieController(CategorieRepository categorieRepository) {
        this.categorieRepository = categorieRepository;
    }


    @GetMapping("/all")
    public List<Categorie> getAll() {
        List<Categorie> categorie = this.categorieRepository.findAll();
        return categorie;
    }

    @PutMapping
    public void insert(@RequestBody Categorie categorie) {
        this.categorieRepository.insert(categorie);
    }

    @PostMapping
    public void update(@RequestBody Categorie categorie) {
        this.categorieRepository.save(categorie);
    }

    @DeleteMapping("/Delete/{id}")
    public void delete(@PathVariable("id") String id) {
        this.categorieRepository.deleteById(id);
    }

    @GetMapping("/find/{id}")
    public Optional<Categorie> findById(@PathVariable("id") String id) {
        Optional<Categorie> categorie = this.categorieRepository.findById(id);
        return categorie;

    }
}
