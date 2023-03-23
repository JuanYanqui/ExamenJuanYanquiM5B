package com.ExamenJuanYanquiM5B.M5BExamenJuanYanqui.models;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document(collection = "Carrera")
public class Carrera {
    private String nombre;
    private String descripcion;

    private List<Ciclo> ListaCiclos;
}
