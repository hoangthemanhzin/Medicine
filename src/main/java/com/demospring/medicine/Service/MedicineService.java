package com.demospring.medicine.Service;

import com.demospring.medicine.model.Medicine;

import java.io.FileNotFoundException;
import java.util.List;

public interface MedicineService {
    //save Medicine:
    public Medicine saveMedicine(Medicine medicine);
    //read ListMedicine:
    public List<Medicine> getAllMedicineList();
    //Example read file text
    public String getTextExample() throws FileNotFoundException;
}
