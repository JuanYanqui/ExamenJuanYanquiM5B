package com.ExamenJuanYanquiM5B.M5BExamenJuanYanqui.controllers;

import com.ExamenJuanYanquiM5B.M5BExamenJuanYanqui.models.Periodo;
import com.ExamenJuanYanquiM5B.M5BExamenJuanYanqui.services.ExamenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/examen")
public class ControllerExamen {
    @Autowired
    ExamenService repositoryExamen;

    @GetMapping("/listar")
    public ResponseEntity<List<Periodo>> listar() {
        return new ResponseEntity<>(repositoryExamen.findByAll(),
                HttpStatus.OK);
    }
    @PostMapping("/crear")
    public ResponseEntity<Periodo> crear(
            @RequestBody Periodo p) {
        return new ResponseEntity<>(repositoryExamen.save(p),
                HttpStatus.CREATED);
    }

    @PutMapping("/actualizar/{id}")
    public ResponseEntity<Periodo> actualizar(@PathVariable Long id, @RequestBody Periodo r) {
        Periodo resta = repositoryExamen.findById(id);
        if (resta == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            try {
                resta.setDireccion(r.getDireccion());
                resta.setCorreo(r.getCorreo());
                return new ResponseEntity<>(repositoryExamen.save(r), HttpStatus.OK);
            } catch (DataAccessException e) {
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }
    }

    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<Periodo> eliminar(@PathVariable Long id) {
        repositoryExamen.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
