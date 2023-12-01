package com.facu.TPFacu;

import com.facu.TPFacu.Entities.Especialidades;
import com.facu.TPFacu.Entities.Tecnicos;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hola mundo!");

        Especialidades especialidad1 = new Especialidades(1, "Prueba1", "prueba1");
        Especialidades especialidad2 = new Especialidades(2, "Prueba2", "prueba2");

        List<Especialidades> listaEspecialidades = new ArrayList<>();

        listaEspecialidades.add(especialidad1);
        listaEspecialidades.add(especialidad2);

        Tecnicos tecnicos = new Tecnicos("Fede", listaEspecialidades);

        System.out.println(tecnicos);
    }
}
