package com.demospring.medicine.Service;

import com.demospring.medicine.model.Medicine;
import com.demospring.medicine.storage.MedicineStorage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

@Service
public class MedicineServiceImpl implements MedicineService{

    @Autowired
    private MedicineStorage medicineStorage;

    //Function save Medicine
    @Override
    public Medicine saveMedicine(Medicine medicine){
        return medicineStorage.save(medicine);
    }
    //Function read Medicine's data

    @Override
    public List<Medicine> getAllMedicineList() {
        //System.out.println(medicineStorage.findAll());
        return medicineStorage.findAll();
    }

    public String getTextExample() throws FileNotFoundException {
        String url = "/home/ad/Data/TAILIEUHOANGTHEMANH/SpringBoot/student/BackEndApp/Template.txt";
        // Đọc dữ liệu từ File với Scanner
        FileInputStream fileInputStream = new FileInputStream(url);
        Scanner scanner = new Scanner(fileInputStream);
        String text = "";
        try {
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
                text = scanner.nextLine();
            }
        } finally {
            try {
                scanner.close();
                fileInputStream.close();
            } catch (IOException ex) {
                Logger.getLogger(null)
                        .log(Level.SEVERE, null, ex);
            }
        }
        return text;
    }
}
