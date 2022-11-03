package com.proyectosoul.tarifusta.Data.Empresas;

import com.proyectosoul.tarifusta.Data.EmpresaInt;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

import static com.proyectosoul.tarifusta.Data.Rutas.*;

public class SanFelipeExpress implements EmpresaInt {

    private List Rutas;

    public SanFelipeExpress() {
        Rutas = new ArrayList<String>();

        //Rutas del Enum Rutas
        Rutas.add(LetreroAzul.name());
        Rutas.add(Mina.name());
        Rutas.add(SantaRosa.name());
    }

    @Override
    public List getRutas() {
        return Rutas;
    }


}
