package com.proyectosoul.tarifusta.Controller;

import com.proyectosoul.tarifusta.Data.Consulta;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api")
public class ApiController {

    @GetMapping("{Inicio}/{Fin}")
    public List Api(@PathVariable String Inicio,@PathVariable String Fin){
        Consulta h = new Consulta(Inicio,Fin);
        return h.Empresas();
    }
}
