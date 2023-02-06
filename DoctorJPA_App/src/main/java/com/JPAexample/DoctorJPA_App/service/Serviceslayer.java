package com.JPAexample.DoctorJPA_App.service;

import com.JPAexample.DoctorJPA_App.Doa.JPARepo;
import com.JPAexample.DoctorJPA_App.Model.Doctor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Serviceslayer {

    @Autowired
    private JPARepo jparepository;

    public Doctor saveDoctor(Doctor doctor)
    {
        return jparepository.save(doctor);
    }

    public List<Doctor> saveAllDoctor(List<Doctor> doctors)
    {
        return jparepository.saveAll(doctors);
    }

    public Doctor getById(int id)
    {
        return jparepository.findById(id).orElse(null);
    }



    public List<Doctor> getAllDoctors()
    {
        return jparepository.findAll();
    }


    public Doctor updateDoctor(Doctor doctor)
    {
        Doctor olddoctor= jparepository.findById(doctor.getId()).orElse(null);

        olddoctor.setName(doctor.getName());
        jparepository.save(olddoctor);

        return olddoctor;


    }

    public String RemoveDoctor(int id)
    {
        jparepository.deleteById(id);
        return "Entry is deleted";
    }
}
