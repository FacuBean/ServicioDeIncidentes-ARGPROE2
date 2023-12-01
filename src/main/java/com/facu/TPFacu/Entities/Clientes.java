package com.facu.TPFacu.Entities;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
public class Clientes {
    private String cuit;
    private String nombre;
    private String razonSocial;
    private List<Servicios> servicios;

}
