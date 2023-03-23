package com.ExamenJuanYanquiM5B.M5BExamenJuanYanqui.models;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document(collection = "Ciclo")
public class Ciclo {
    private String nombre;
    private String descripcion;

    private List<Profesor> ListaProfesores;

}
