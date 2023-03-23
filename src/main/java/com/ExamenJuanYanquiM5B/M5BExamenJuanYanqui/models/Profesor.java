package com.ExamenJuanYanquiM5B.M5BExamenJuanYanqui.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document(collection = "Profesor")
public class Profesor {

    private String nombre;
    private String apellido;
    private String cedular;
    private String correo;
    private String direccion;

    private List<Asignatura> ListaAsignaturas;
}
