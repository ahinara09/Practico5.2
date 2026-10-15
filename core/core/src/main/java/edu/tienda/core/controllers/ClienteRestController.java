package edu.tienda.core.controllers;

import edu.tienda.core.domain.Cliente;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class ClienteRestController {

    private List<Cliente> clientes = new ArrayList<>(Arrays.asList(
            new Cliente("Armstrong","1234","arm"),
            new Cliente("Aldrin","1234","ald"),
            new Cliente("Collins","1234","col")
    )
    );

    @GetMapping("/clientes")
    public List<Cliente> getClientes(){
        return clientes;
    }

}
