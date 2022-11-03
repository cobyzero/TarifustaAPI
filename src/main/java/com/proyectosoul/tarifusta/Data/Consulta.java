package com.proyectosoul.tarifusta.Data;

import com.proyectosoul.tarifusta.Data.Empresas.SanFelipeExpress;
import com.proyectosoul.tarifusta.Data.Empresas.Vipusa;

import java.util.ArrayList;
import java.util.List;

public class Consulta {
    private String Inicio, Fin;
    private List EmpresaQuePuedeUsar;

    public Consulta(String Inicio, String Fin) {
        this.Inicio = Inicio;
        this.Fin = Fin;
    }


    public List Empresas() {
        EmpresaQuePuedeUsar = new ArrayList();
        //Empresas
        if (_SanFelipeExpress.getRutas().contains(Inicio) && _SanFelipeExpress.getRutas().contains(Fin)) {
            EmpresaQuePuedeUsar.add(_SanFelipeExpress.getClass().getSimpleName());
        }
        if (_Vipusa.getRutas().contains(Inicio) && _Vipusa.getRutas().contains(Fin)) {
            EmpresaQuePuedeUsar.add(_Vipusa.getClass().getSimpleName());
        }

        return EmpresaQuePuedeUsar;
    }


    SanFelipeExpress _SanFelipeExpress = new SanFelipeExpress();
    Vipusa _Vipusa = new Vipusa();

}
