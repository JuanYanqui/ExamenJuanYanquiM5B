package com.ExamenJuanYanquiM5B.M5BExamenJuanYanqui.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document(collection = "Restaurante")
public class Restaurante {
    @Id
    private Long id;
    private String nombre;
    private String telefono;
    private String correo;
    private String direccion;
    private Carta carta;

    private List<Cliente> ListaClientes;
}
