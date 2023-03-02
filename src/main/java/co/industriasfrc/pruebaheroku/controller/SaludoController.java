package co.industriasfrc.pruebaheroku.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/saludos")
public class SaludoController {
    
    @Value("${app.varexample}")
    String name;

    
    @GetMapping("/hola")
    public String saludo(){
        return "Hola "+name;
    }
}
