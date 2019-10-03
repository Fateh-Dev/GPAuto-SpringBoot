package gestionparcautomobile.demo.Controllers;

import gestionparcautomobile.demo.Interfaces.DatePanneRepository;
import gestionparcautomobile.demo.Interfaces.MissionRepository;
import gestionparcautomobile.demo.Models.DatePanne;
import gestionparcautomobile.demo.Models.Mission;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/Missions")
public class MissionController {
    private MissionRepository missionRepository;

    public MissionController(MissionRepository missionRepository) {
        this.missionRepository = missionRepository;
    }

    @GetMapping("/all")
    public List<Mission> getAll(){
        List<Mission> controlTech=this.missionRepository.findAll();
        return controlTech;
    }

    @PutMapping
    public void insert(@RequestBody Mission mission){
        this.missionRepository.insert(mission);
    }
    @PostMapping
    public void update(@RequestBody Mission mission){
        this.missionRepository.save(mission);
    }
    @DeleteMapping("/Delete/{id}")
    public void delete(@PathVariable("id") String id){
        this.missionRepository.deleteById(id);
    }

    @GetMapping("/find/{id}")
    public Optional<Mission> findById(@PathVariable("id") String id){
        Optional<Mission> mission=this.missionRepository.findById(id);
        return mission;
    }
}
