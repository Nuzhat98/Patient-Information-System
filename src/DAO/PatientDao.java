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

import Model.Patient;

public interface PatientDao {
	public List<Patient> allPatients();
	public Patient createPatient(Patient patient);
	public void updatePatient(Patient patient);
	public void deletePatient(long id);
	public List<Map<String, Object>> searchPatientByName(String name);
	public Patient searchPatientById(long id);
}