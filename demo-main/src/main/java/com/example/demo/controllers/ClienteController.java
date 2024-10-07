package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.models.Cliente;
import com.example.demo.services.ClienteService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/cliente") 
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping 
    public List<Cliente> getCliente() {
        return clienteService.getAllCliente();
    }

    @PostMapping // Crear un nuevo cliente
    public void createCliente(@RequestBody Cliente cliente) {
        clienteService.createCliente(cliente);
    }

    @GetMapping("/{id}") // Obtener un cliente por ID
    public Optional<Cliente> getClienteById(@PathVariable Integer id) {
        return clienteService.getClienteById(id);
    }

    @PutMapping("/{id}") // Actualizar un cliente existente
    public void updateCliente(@PathVariable Integer id, @RequestBody Cliente cliente) {
        cliente.setIdCliente(id); // Asegúrate de que se establece el ID correcto
        clienteService.updateCliente(cliente);
    }

    @DeleteMapping("/{id}") // Eliminar un cliente
    public void deleteCliente(@PathVariable Integer id) {
        clienteService.deleteCliente(id);
    }
}
