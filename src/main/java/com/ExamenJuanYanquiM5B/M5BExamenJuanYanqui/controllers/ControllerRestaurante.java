package com.ExamenJuanYanquiM5B.M5BExamenJuanYanqui.controllers;

import com.ExamenJuanYanquiM5B.M5BExamenJuanYanqui.models.Restaurante;
import com.ExamenJuanYanquiM5B.M5BExamenJuanYanqui.services.ExamenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/examen")
public class ControllerRestaurante {
    @Autowired
    ExamenService repositoryExamen;

    @GetMapping("/listar")
    public ResponseEntity<List<Restaurante>> listar() {
        return new ResponseEntity<>(repositoryExamen.findByAll(),
                HttpStatus.OK);
    }
    @PostMapping("/crear")
    public ResponseEntity<Restaurante> crear(
            @RequestBody Restaurante p) {
        return new ResponseEntity<>(repositoryExamen.save(p),
                HttpStatus.CREATED);
    }

    @PutMapping("/actualizar/{id}")
    public ResponseEntity<Restaurante> actualizar(@PathVariable Long id, @RequestBody Restaurante r) {
        Restaurante resta = repositoryExamen.findById(id);
        if (resta == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            try {
                resta.setNombre(r.getNombre());
                resta.setDireccion(r.getDireccion());
                resta.setCorreo(r.getCorreo());
                resta.setCarta(r.getCarta());
                resta.setTelefono(r.getTelefono());
                return new ResponseEntity<>(repositoryExamen.save(r), HttpStatus.OK);
            } catch (DataAccessException e) {
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }
    }

    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<Restaurante> eliminar(@PathVariable Long id) {
        repositoryExamen.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
