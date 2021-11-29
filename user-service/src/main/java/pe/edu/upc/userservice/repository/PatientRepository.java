package pe.edu.upc.userservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.upc.userservice.entity.Patient;

public interface PatientRepository extends JpaRepository<Patient, Long> {
}
