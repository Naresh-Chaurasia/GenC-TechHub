package com.bt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/clinical")
public class ClinicalDataController {

    @Autowired
    private ClinicalDataRepository repository;

    @GetMapping
    public List<ClinicalData> getAllClinicalData() {
        return repository.findAll();
    }

    @PostMapping
    public ClinicalData createClinicalData(@RequestBody ClinicalData clinicalData) {
        return repository.save(clinicalData);
    }

    @GetMapping("/{id}")
    public ClinicalData getClinicalDataById(@PathVariable Long id) {
        return repository.findById(id).orElseThrow(() -> new RuntimeException("Clinical data not found"));
    }

    @PutMapping("/{id}")
    public ClinicalData updateClinicalData(@PathVariable Long id, @RequestBody ClinicalData updatedData) {
        ClinicalData existingData = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Clinical data not found"));
        existingData.setDiagnosis(updatedData.getDiagnosis());
        existingData.setTreatment(updatedData.getTreatment());
        return repository.save(existingData);
    }

    @DeleteMapping("/{id}")
    public void deleteClinicalData(@PathVariable Long id) {
        repository.deleteById(id);
    }
}