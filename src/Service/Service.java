/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

/**
 *
 * @author HP
 */
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;

import DAO.impl.DoctorDAOImpl;
import DAO.impl.HospitalDAOImpl;
import DAO.impl.PatientDAOImpl;
import Model.Doctor;
import Model.Hospital;
import Model.Patient;

//@Service
public class Service{
	
	@Autowired
	DoctorDAOImpl doctorDao;
	
	@Autowired
	PatientDAOImpl patientDao;
	
	@Autowired
	HospitalDAOImpl hospitalDao;
	
	List<Doctor> listDoctors;
	List<Patient> listPatients;
	
	
	//hospital
	
	public List<Hospital> getHospital() {
		return hospitalDao.getHospital();
	}
	
	//Doctor
	
	public List<Doctor> showAllDoctors(){
		listDoctors=doctorDao.allDoctors();
		return listDoctors;
	}

	public List<Map<String, Object>> searchDoctorByName(String doctorName){
		return doctorDao.searchDoctorByName(doctorName);
	}
	
	public Doctor searchDoctorById(long id) {	
		return doctorDao.searchDoctorById(id);
	}
	
	public Doctor createDoctor(Doctor doctor) {
		return doctorDao.createDoctor(doctor);
	}
	
	public Doctor updateDoctor(Doctor doctor) {
		return doctorDao.updateDoctor(doctor);
	}
	
	public void deleteDoctor(long id){
		doctorDao.deleteDoctor(id);
	}
	//Patients
	
	public List<Patient> showAllPatients(){
		listPatients=patientDao.allPatients();
		return listPatients;
	}
	
	public List<Map<String, Object>> searchPatientByName(String patientName){
		return patientDao.searchPatientByName(patientName);
	}
	
	public Patient searchPatientById(long id) {
		return patientDao.searchPatientById(id);
	}
	
	public Patient createPatient(Patient patient) {
		return patientDao.createPatient(patient);
	}
	
	public void updatePatient(Patient patient){
		patientDao.updatePatient(patient);
	}
	
	public void deletePatient(long id){
		patientDao.deletePatient(id);
	}
	

}

