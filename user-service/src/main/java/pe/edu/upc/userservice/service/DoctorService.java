package pe.edu.upc.userservice.service;

import pe.edu.upc.userservice.entity.Client;
import pe.edu.upc.userservice.entity.Doctor;

import java.util.List;

public interface DoctorService {
    public List<Doctor> findAll();
    public Doctor create(Doctor doctor);
    public Doctor update(Doctor doctor);
    public Doctor delete(Doctor doctor);
    public Doctor getById(Long id);
}
