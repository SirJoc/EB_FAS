package pe.edu.upc.userservice.service;

import pe.edu.upc.userservice.entity.Doctor;
import pe.edu.upc.userservice.entity.Patient;

import java.util.List;

public interface PatientService {
    public List<Patient> findAll();
    public Patient create(Patient patient);
    public Patient update(Patient patient);
    public Patient delete(Patient patient);
    public Patient getById(Long id);
}
