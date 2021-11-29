package pe.edu.upc.userservice.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.userservice.entity.Client;
import pe.edu.upc.userservice.repository.ClientRepository;
import pe.edu.upc.userservice.service.ClientService;

import java.util.List;

@Slf4j
@Service
public class ClientServiceImpl implements ClientService {
    @Autowired
    ClientRepository clientRepository;

    @Override
    public List<Client> findAll() {
        return clientRepository.findAll();
    }

    @Override
    public Client create(Client client) {
        return clientRepository.save(client);
    }

    @Override
    public Client update(Client client) {
        return null;
    }

    @Override
    public Client delete(Client client) {
        return null;
    }

    @Override
    public Client getById(Long id) {
        return null;
    }
}
