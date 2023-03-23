package com.ExamenJuanYanquiM5B.M5BExamenJuanYanqui.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "Asignatura")
public class Asignatura {

    private String nombre;
    private Integer n_horas;
    private Integer n_horas_practicas;
    private Integer n_horas_autonomas;

}
