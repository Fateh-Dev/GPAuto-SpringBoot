package gestionparcautomobile.demo.Controllers;

import gestionparcautomobile.demo.Interfaces.AssuranceRepository;
import gestionparcautomobile.demo.Interfaces.ControlTechRepository;
import gestionparcautomobile.demo.Models.Assurance;
import gestionparcautomobile.demo.Models.ControlTech;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/ControlTechs")
public class ControlTechController {


    private ControlTechRepository controlTechRepository;

    public ControlTechController(ControlTechRepository controlTechRepository) {
        this.controlTechRepository = controlTechRepository;
    }

        @GetMapping("/all")
        public List<ControlTech> getAll(){
            List<ControlTech> controlTech=this.controlTechRepository.findAll();
            return controlTech;
        }

        @PutMapping
        public void insert(@RequestBody ControlTech controlTech){
            this.controlTechRepository.insert(controlTech);
        }
        @PostMapping
        public void update(@RequestBody ControlTech controlTech){
            this.controlTechRepository.save(controlTech);
        }
        @DeleteMapping("/Delete/{id}")
        public void delete(@PathVariable("id") String id){
            this.controlTechRepository.deleteById(id);
        }

        @GetMapping("/find/{id}")
        public Optional<ControlTech> findById(@PathVariable("id") String id){
            Optional<ControlTech> controlTech=this.controlTechRepository.findById(id);
            return controlTech;
        }
    }

