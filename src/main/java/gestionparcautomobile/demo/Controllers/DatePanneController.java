package gestionparcautomobile.demo.Controllers;

import gestionparcautomobile.demo.Interfaces.ControlTechRepository;
import gestionparcautomobile.demo.Interfaces.DatePanneRepository;
import gestionparcautomobile.demo.Models.ControlTech;
import gestionparcautomobile.demo.Models.DatePanne;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/DatePannes")
public class DatePanneController {
    private DatePanneRepository datePanneRepository;

    public DatePanneController(DatePanneRepository datePanneRepository) {
        this.datePanneRepository = datePanneRepository;
    }

    @GetMapping("/all")
    public List<DatePanne> getAll(){
        List<DatePanne> controlTech=this.datePanneRepository.findAll();
        return controlTech;
    }

    @PutMapping
    public void insert(@RequestBody DatePanne datePanne){
        this.datePanneRepository.insert(datePanne);
    }
    @PostMapping
    public void update(@RequestBody DatePanne datePanne){
        this.datePanneRepository.save(datePanne);
    }
    @DeleteMapping("/Delete/{id}")
    public void delete(@PathVariable("id") String id){
        this.datePanneRepository.deleteById(id);
    }

    @GetMapping("/find/{id}")
    public Optional<DatePanne> findById(@PathVariable("id") String id){
        Optional<DatePanne> datePanne=this.datePanneRepository.findById(id);
        return datePanne;
    }
}
