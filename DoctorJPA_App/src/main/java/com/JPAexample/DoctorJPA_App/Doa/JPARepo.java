package com.JPAexample.DoctorJPA_App.Doa;

import com.JPAexample.DoctorJPA_App.Model.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JPARepo extends JpaRepository<Doctor,Integer> {

}
