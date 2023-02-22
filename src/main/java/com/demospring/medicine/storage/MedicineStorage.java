package com.demospring.medicine.storage;

import com.demospring.medicine.model.Medicine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface MedicineStorage extends JpaRepository<Medicine,Integer>{
    // Write MySql here :
}
