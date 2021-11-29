package pe.edu.upc.userservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.upc.userservice.entity.Doctor;

public interface DoctorRepository extends JpaRepository<Doctor, Long> {
}
