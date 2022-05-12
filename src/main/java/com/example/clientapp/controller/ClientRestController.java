package com.example.clientapp.controller;

import com.example.clientapp.models.entity.Client;
import com.example.clientapp.models.services.IClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/api")
public class ClientRestController {
    @Autowired
    private IClientService clientService;

    @GetMapping("/clients")
    public List<Client> index(){
        return clientService.findAll();
    }
}
