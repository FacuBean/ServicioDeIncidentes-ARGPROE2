package com.facu.TPFacu.Entities;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@Data
@AllArgsConstructor
public class Incidentes {
    private String id;
    private String descripcion;
    private String tipoProblema;
    private int estado;
    private Date fechaInicio;
    private Date fechaFin;
    Tecnicos tecnicos;
    private Float horasEstimadas;
    private Boolean eComplejo;
}
