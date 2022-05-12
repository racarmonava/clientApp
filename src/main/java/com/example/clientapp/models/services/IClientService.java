package com.example.clientapp.models.services;

import com.example.clientapp.models.entity.Client;

import java.util.List;

public interface IClientService {
    public List<Client> findAll();
    public Client findById(Long id);
    public Client save(Client client);
    public void delete(Long id);
}
