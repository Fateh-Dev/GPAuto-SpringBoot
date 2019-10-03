package gestionparcautomobile.demo.Controllers;

import gestionparcautomobile.demo.Interfaces.ParkingRepository;
import gestionparcautomobile.demo.Interfaces.PositionRepository;
import gestionparcautomobile.demo.Models.Parking;
import gestionparcautomobile.demo.Models.Position;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/Positions")
public class PositionController {
    private PositionRepository positionRepository;

    public PositionController(PositionRepository positionRepository) {
        this.positionRepository = positionRepository;
    }

    @GetMapping("/all")
    public List<Position> getAll(){
        List<Position> position=this.positionRepository.findAll();
        return position;
    }

    @PutMapping
    public void insert(@RequestBody Position position){
        this.positionRepository.insert(position);
    }
    @PostMapping
    public void update(@RequestBody Position position){
        this.positionRepository.save(position);
    }
    @DeleteMapping("/Delete/{id}")
    public void delete(@PathVariable("id") String id){
        this.positionRepository.deleteById(id);
    }

    @GetMapping("/find/{id}")
    public Optional<Position> findById(@PathVariable("id") String id){
        Optional<Position> position=this.positionRepository.findById(id);
        return position;

    }
}
