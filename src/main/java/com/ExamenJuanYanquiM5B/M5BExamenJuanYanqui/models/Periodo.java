package com.ExamenJuanYanquiM5B.M5BExamenJuanYanqui.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document(collection = "Periodo")
public class Periodo {
    @Id
    private Long id;
    private String periodo;
    private Integer year;
    private String correo;
    private String direccion;

    private List<Carrera> ListaCarreras;
}
