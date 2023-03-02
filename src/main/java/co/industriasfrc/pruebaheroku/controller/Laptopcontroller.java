package co.industriasfrc.pruebaheroku.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.industriasfrc.pruebaheroku.entities.*;
import co.industriasfrc.pruebaheroku.repositories.Laptoprepository;

@RestController
@RequestMapping("/store")
public class Laptopcontroller {

    private Laptoprepository laptoprepository;

    /* public Laptopcontroller(Laptoprepository laptoprepository) {
        this.laptoprepository = laptoprepository;
    } */
    @Autowired
    public void setLaptoprepository(Laptoprepository laptoprepository) {
        this.laptoprepository = laptoprepository;
    }

    @GetMapping("/api/laptops")
    public List<Laptop> laptops() {
        return laptoprepository.findAll(); 
    }

    @GetMapping("api/laptops/{id}")
    public ResponseEntity<Laptop> laptopById(@PathVariable Long id){
        Optional<Laptop> opt_laptop=laptoprepository.findById(id);
        if(opt_laptop.isPresent()){
            return ResponseEntity.ok(opt_laptop.get());
        }else {
            return ResponseEntity.notFound().build();
        }
    }
    @PostMapping("api/laptops/create")
    public Laptop createLaptop(@RequestBody Laptop laptop){
        return laptoprepository.save(laptop);
    }

    
}


