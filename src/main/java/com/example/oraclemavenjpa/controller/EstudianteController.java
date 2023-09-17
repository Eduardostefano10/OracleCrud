package com.example.oraclemavenjpa.controller;


import com.example.oraclemavenjpa.model.Estudiante;
import com.example.oraclemavenjpa.service.EstudianteService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.example.oraclemavenjpa.Apis.OrganizandoLasAPis.ESTUDIANTE_API;

@RestController
@RequestMapping(ESTUDIANTE_API)
public class EstudianteController {

    @Autowired
    private EstudianteService service;
    @GetMapping
    public List<Estudiante> buscarTodosLosClientes() {

        return service.buscarTodosLosClientes();
    }

    @PostMapping
    public Estudiante crearCliente(@RequestBody Estudiante cliente) {
        return service.crearCliente(cliente);
    }

    @GetMapping("/{id}")
    public Estudiante buscarClientePorId(@PathVariable Integer id) {
        return service.buscarClientePorId(id);
    }

    @DeleteMapping("/{id}")
    public void eliminarCliente(@PathVariable Integer id) {
        service.eliminarCliente(id);
    }
    }
