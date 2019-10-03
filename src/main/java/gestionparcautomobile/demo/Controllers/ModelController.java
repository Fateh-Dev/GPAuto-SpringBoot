package gestionparcautomobile.demo.Controllers;

import gestionparcautomobile.demo.Interfaces.MarqueRepository;
import gestionparcautomobile.demo.Interfaces.ModelRepository;
import gestionparcautomobile.demo.Models.Marque;
import gestionparcautomobile.demo.Models.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/Models")
public class ModelController {
    private ModelRepository modelRepository;

    public ModelController(ModelRepository modelRepository) {
        this.modelRepository = modelRepository;
    }

    @GetMapping("/all")
    public List<Model> getAll(){
        List<Model> models=this.modelRepository.findAll();
        return models;
    }

    @PutMapping
    public void insert(@RequestBody Model model){
        this.modelRepository.insert(model);
    }
    @PostMapping
    public void update(@RequestBody Model model){
        this.modelRepository.save(model);
    }
    @DeleteMapping("/Delete/{id}")
    public void delete(@PathVariable("id") String id){
        this.modelRepository.deleteById(id);
    }

    @GetMapping("/find/{id}")
    public Optional<Model> findById(@PathVariable("id") String id){
        Optional<Model> model=this.modelRepository.findById(id);
        return model;

    }
}
