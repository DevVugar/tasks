package com.example.mentorspringtask.Repository;

import com.example.mentorspringtask.Model.Entity.Medicine;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicineRepository extends JpaRepository<Medicine,Integer> {
}
