package co.industriasfrc.pruebaheroku.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import co.industriasfrc.pruebaheroku.entities.*;

public interface Laptoprepository extends JpaRepository<Laptop,Long> {
    
}
