package com.example.oraclemavenjpa.service;


import com.example.oraclemavenjpa.model.Estudiante;
import com.example.oraclemavenjpa.repository.EstudianteRepositorio;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class EstudianteService {

    private final EstudianteRepositorio clienteRepository;

    public EstudianteService(EstudianteRepositorio clienteRepository) {

        this.clienteRepository = clienteRepository;
    }

    public Estudiante crearCliente(Estudiante cliente) {
        return clienteRepository.save(cliente);
    }

    public Estudiante buscarClientePorId(Integer id) {

        return clienteRepository.findById(id).orElse(null);
    }

    public List<Estudiante> buscarTodosLosClientes() {
        return clienteRepository.findAll();
    }

    public void eliminarCliente(Integer id) {
        clienteRepository.deleteById(id);
    }
}