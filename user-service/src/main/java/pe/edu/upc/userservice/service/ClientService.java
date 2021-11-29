package pe.edu.upc.userservice.service;

import pe.edu.upc.userservice.entity.Client;

import java.util.List;

public interface ClientService {
    public List<Client> findAll();
    public Client create(Client client);
    public Client update(Client client);
    public Client delete(Client client);
    public Client getById(Long id);
}
