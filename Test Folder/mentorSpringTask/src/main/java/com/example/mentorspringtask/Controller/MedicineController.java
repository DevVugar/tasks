package com.example.mentorspringtask.Controller;


import com.example.mentorspringtask.Model.Entity.Medicine;
import com.example.mentorspringtask.Service.MedicineService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/medicines")
public class MedicineController {

    private final MedicineService medicineService;

    @GetMapping("/{id}")
    public Medicine getBYId(@PathVariable Integer id){
        return medicineService.getByID(id);
    }


    @PutMapping
    public Medicine update(@RequestBody Medicine medicine){
        return medicineService.update(medicine);
    }


    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public Medicine insert(@RequestBody Medicine medicine){
        return medicineService.insert(medicine);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping
    public void delete(@RequestParam Integer id){
        medicineService.delete(id);
    }

    @GetMapping
    public List<Medicine> getList(){
        return medicineService.getList();
    }
}
