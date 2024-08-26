package com.example.mentorspringtask.Service;

import com.example.mentorspringtask.Model.Entity.Medicine;

import java.util.List;

public interface MedicineService {

    Medicine getByID(Integer id);
    Medicine update(Medicine medicine);

    Medicine insert(Medicine medicine);

    void delete (Integer id);

    List<Medicine> getList();
}
