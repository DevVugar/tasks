package com.example.mentorspringtask.Service.Imple;

import com.example.mentorspringtask.Model.Entity.Medicine;
import com.example.mentorspringtask.Repository.MedicineRepository;
import com.example.mentorspringtask.Service.MedicineService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MedicineServiceImple implements MedicineService {

    private final MedicineRepository medicineRepository;

    @Override
    public Medicine getByID(Integer id) {
        return medicineRepository.findById(id).orElseThrow(NullPointerException::new);
    }

    @Override
    public Medicine update(Medicine medicine) {
        return medicineRepository.save(medicine);
    }

    @Override
    public Medicine insert(Medicine medicine) {
        return medicineRepository.save(medicine);
    }

    @Override
    public void delete(Integer id) {
        medicineRepository.deleteById(id);
    }

    @Override
    public List<Medicine> getList() {
        return medicineRepository.findAll();
    }
}
