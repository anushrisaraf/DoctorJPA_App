package com.JPAexample.DoctorJPA_App.Controller;

import com.JPAexample.DoctorJPA_App.Model.Doctor;
import com.JPAexample.DoctorJPA_App.service.Serviceslayer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controller {

    @Autowired
    private Serviceslayer serviceslayer;

    @PostMapping("/addDoctor")
        public Doctor addDoctor(@RequestBody Doctor doctor)
    {
        return serviceslayer.saveDoctor(doctor);
    }

    @PostMapping("/addDoctors")
    public List<Doctor> addDoctors(@RequestBody List<Doctor> doctors)
    {
        return serviceslayer.saveAllDoctor(doctors);
    }

    @GetMapping("/doctor/{id}")
    public Doctor getById(@PathVariable int id)
    {
        return serviceslayer.getById(id);
    }

    @GetMapping("/alldoctor")
    public List<Doctor> getAll()
    {
        return serviceslayer.getAllDoctors();
    }

    @PutMapping("/updatedoctor")
    public Doctor updateDoctor(@RequestBody Doctor doctor)
    {
        return serviceslayer.updateDoctor(doctor);
    }

    @DeleteMapping("/deleteentry/{id}")
    public String removedata(@PathVariable int id)
    {
        return serviceslayer.RemoveDoctor(id);
    }


}
