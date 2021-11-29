package pe.edu.upc.userservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.upc.userservice.entity.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
