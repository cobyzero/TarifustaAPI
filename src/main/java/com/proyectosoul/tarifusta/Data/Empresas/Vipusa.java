package com.proyectosoul.tarifusta.Data.Empresas;

import com.proyectosoul.tarifusta.Data.EmpresaInt;

import java.util.ArrayList;
import java.util.List;

import static com.proyectosoul.tarifusta.Data.Rutas.*;

public class Vipusa implements EmpresaInt {

    public Vipusa() {
        Rutas = new ArrayList<String>();

        //Rutas del Enum Rutas
        Rutas.add(SanJoseDeLasLomas.name());
        Rutas.add(SantaRosa.name());
        Rutas.add(Mina.name());
    }

    @Override
    public List getRutas() {
        return Rutas;
    }

    private List Rutas;
}
