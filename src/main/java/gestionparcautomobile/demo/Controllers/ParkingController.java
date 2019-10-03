package gestionparcautomobile.demo.Controllers;

import gestionparcautomobile.demo.Interfaces.PanneRepository;
import gestionparcautomobile.demo.Interfaces.ParkingRepository;
import gestionparcautomobile.demo.Models.Panne;
import gestionparcautomobile.demo.Models.Parking;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/Parkings")
public class ParkingController {
    private ParkingRepository parkingRepository;

    public ParkingController(ParkingRepository parkingRepository) {
        this.parkingRepository = parkingRepository;
    }

    @GetMapping("/all")
    public List<Parking> getAll(){
        List<Parking> parking=this.parkingRepository.findAll();
        return parking;
    }

    @PutMapping
    public void insert(@RequestBody Parking parking){
        this.parkingRepository.insert(parking);
    }
    @PostMapping
    public void update(@RequestBody Parking parking){
        this.parkingRepository.save(parking);
    }
    @DeleteMapping("/Delete/{id}")
    public void delete(@PathVariable("id") String id){
        this.parkingRepository.deleteById(id);
    }

    @GetMapping("/find/{id}")
    public Optional<Parking> findById(@PathVariable("id") String id){
        Optional<Parking> parking=this.parkingRepository.findById(id);
        return parking;

    }
}
