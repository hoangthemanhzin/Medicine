package com.demospring.medicine.controller;

import java.io.FileNotFoundException;
import java.util.List;

import com.demospring.medicine.Service.MedicineService;
import com.demospring.medicine.model.Medicine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/medicine")
@CrossOrigin
public class MedicineController {
    @Autowired
    private MedicineService medicineService;

    //mapping http://localhost:8080/medicine/add
    @PostMapping("add")
    public String addMedicine(@RequestBody Medicine medicine){
        this.medicineService.saveMedicine(medicine);
        return "new Medicine added";
    }

    //mapping http://localhost:8080/medicine/getAll
    @GetMapping("/getAll")
    public List<Medicine> getAllMedicineList(){
        return medicineService.getAllMedicineList();
    }


    //Exaple read file text controller
    @GetMapping("/exmaple")
    public String getText() throws FileNotFoundException {
        String text = medicineService.getTextExample();
        return text;
    }
}
