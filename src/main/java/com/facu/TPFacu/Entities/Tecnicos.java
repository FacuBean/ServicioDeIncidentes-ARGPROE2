package com.facu.TPFacu.Entities;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class Tecnicos {
    private String nombre;
    private List<Especialidades> especialidades;
}
