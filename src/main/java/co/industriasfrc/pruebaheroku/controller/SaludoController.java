package co.industriasfrc.pruebaheroku.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SaludoController {
    
    @Value("${app.varexample}")
    String name;

    
    @GetMapping("/hola")
    public String saludo(){
        return "Hola ";
    }
}
