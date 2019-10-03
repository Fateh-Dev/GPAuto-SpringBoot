package gestionparcautomobile.demo;

import gestionparcautomobile.demo.Interfaces.CouleurRepository;
import gestionparcautomobile.demo.Interfaces.MarqueRepository;
import gestionparcautomobile.demo.Interfaces.ModelRepository;
import gestionparcautomobile.demo.Models.Couleur;
import gestionparcautomobile.demo.Models.Marque;
import gestionparcautomobile.demo.Models.Model;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.*;


@Component
public class DbSeeder implements CommandLineRunner {
    private CouleurRepository couleurRepository;
    private MarqueRepository marqueRepository;
    private ModelRepository modelRepository;

    public DbSeeder(CouleurRepository couleurRepository, MarqueRepository marqueRepository, ModelRepository modelRepository) {
        this.couleurRepository = couleurRepository;
        this.marqueRepository = marqueRepository;
        this.modelRepository = modelRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        /*this.couleurRepository.deleteAll();
        this.marqueRepository.deleteAll();
        this.modelRepository.deleteAll();

        Marque hp=new Marque(
                "HP");
        Marque dell=new Marque(
                "Dell");
        Couleur red=new Couleur(
                "Red","أحمر"
        );
        Couleur blue=new Couleur(
                "Blue","أحمر"
        );
        Couleur white=new Couleur(
                "white","أحمر"
        );
        List<Couleur> allCol= Arrays.asList(red,blue,white);
        List<Marque> allMarques=Arrays.asList(dell,hp);
        this.couleurRepository.saveAll(allCol);
        this.marqueRepository.saveAll(allMarques);*/
    }
}
