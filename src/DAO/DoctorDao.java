/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

/**
 *
 * @author HP
 */
import java.util.List;
import java.util.Map;

import Model.Doctor;

public interface DoctorDao{
	public List<Doctor> allDoctors();
	public Doctor createDoctor(Doctor doctor);
	public Doctor updateDoctor(Doctor doctor);
	public void deleteDoctor(long id);
	public List<Map<String, Object>> searchDoctorByName(String name);
	public Doctor searchDoctorById(long id);
	
}
