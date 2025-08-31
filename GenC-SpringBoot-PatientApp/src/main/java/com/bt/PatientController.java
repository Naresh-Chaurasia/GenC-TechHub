package com.bt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/patients")
public class PatientController {

    @Autowired
    private PatientRepository repository;

    // Get all patients
    @GetMapping
    public List<Patient> getAllPatients() {
        return repository.findAll();
    }

    // Get a patient by ID
    @GetMapping("/{id}")
    public Patient getPatientById(@PathVariable Long id) {
        return repository.findById(id).orElseThrow(() -> new RuntimeException("Patient not found"));
    }

    // Create a new patient
    @PostMapping
    public Patient createPatient(@RequestBody Patient patient) {
        return repository.save(patient);
    }

    // Update an existing patient
    @PutMapping("/{id}")
    public Patient updatePatient(@PathVariable Long id, @RequestBody Patient updatedPatient) {
        Patient existingPatient = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Patient not found"));
        existingPatient.setFirstName(updatedPatient.getFirstName());
        existingPatient.setLastName(updatedPatient.getLastName());
        existingPatient.setAge(updatedPatient.getAge());
        return repository.save(existingPatient);
    }

    // Delete a patient
    @DeleteMapping("/{id}")
    public void deletePatient(@PathVariable Long id) {
        repository.deleteById(id);
    }
}