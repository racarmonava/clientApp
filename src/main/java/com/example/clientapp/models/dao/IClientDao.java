package com.example.clientapp.models.dao;

import com.example.clientapp.models.entity.Client;
import org.springframework.data.repository.CrudRepository;

public interface IClientDao extends CrudRepository<Client,Long> {

}
