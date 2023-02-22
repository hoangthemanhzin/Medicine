package com.demospring.medicine;

import com.demospring.medicine.model.Medicine;
import com.demospring.medicine.storage.MedicineStorage;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MedicineApplicationTests {

	@Test
	void contextLoads() {

	}
	@Test
	public void testCreate(){
		Medicine medicine = new Medicine(3,"dsfag",23454,325);
		MedicineStorage medicineStorage = Mockito.mock(MedicineStorage.class);
		Mockito.when(medicineStorage.save(medicine)).thenReturn(medicine);
	}

}
