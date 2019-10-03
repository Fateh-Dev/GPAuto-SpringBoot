package gestionparcautomobile.demo.Controllers;


import gestionparcautomobile.demo.Interfaces.PositionRepository;
import gestionparcautomobile.demo.Interfaces.TypePanneRepository;
import gestionparcautomobile.demo.Models.Position;
import gestionparcautomobile.demo.Models.TypePanne;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/TypePannes")
public class TypePanneController {
    private TypePanneRepository typePanneRepository;

    public TypePanneController(TypePanneRepository typePanneRepository) {
        this.typePanneRepository = typePanneRepository;
    }

    @GetMapping("/all")
    public List<TypePanne> getAll(){
        List<TypePanne> typePannes=this.typePanneRepository.findAll();
        return typePannes;
    }

    @PutMapping
    public void insert(@RequestBody TypePanne typePanne){
        this.typePanneRepository.insert(typePanne);
    }
    @PostMapping
    public void update(@RequestBody TypePanne typePanne){
        this.typePanneRepository.save(typePanne);
    }
    @DeleteMapping("/Delete/{id}")
    public void delete(@PathVariable("id") String id){
        this.typePanneRepository.deleteById(id);
    }

    @GetMapping("/find/{id}")
    public Optional<TypePanne> findById(@PathVariable("id") String id){
        Optional<TypePanne> typePanne=this.typePanneRepository.findById(id);
        return typePanne;

    }
}
