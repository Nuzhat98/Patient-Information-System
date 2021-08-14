/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

/**
 *
 * @author HP
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;


import Model.Patient;
import Service.Service;

@RestController
@RequestMapping("/patient")
public class patientController {
    
	@Autowired
	Service service;
        
    @RequestMapping("/patients")
	List<Patient> showAllPatients(){
		List<Patient> listAllPatients= new ArrayList<Patient>();
		listAllPatients=service.showAllPatients();
		return listAllPatients;
	}
	
	@RequestMapping("/patients/viewByName/{name}")
	List<Map<String, Object>> patientViewByName(@PathVariable("name") String name ) {
		return service.searchPatientByName(name);
	}
	
	@RequestMapping("/patients/viewById/{id}")
	Patient patientViewById(@PathVariable("id") long id) {
		return service.searchPatientById(id);
	}
	
	@RequestMapping(value="/patients/addPatient",method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(value = HttpStatus.OK)
	void addPatient(@RequestBody Patient patient) throws Exception{
		service.createPatient(patient);
	}
	
	@RequestMapping(value="/patients/updatePatient/{id}",method=RequestMethod.PUT,consumes=MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(value=HttpStatus.OK)
	void updatePatient(@PathVariable("id") long id, @RequestBody Patient patient) throws Exception{
		patient.setId(id);
		service.updatePatient(patient);
	}
	
	@RequestMapping(value="/patients/deletePatient/{id}",method=RequestMethod.DELETE)
	@ResponseStatus(value=HttpStatus.OK)
	void deletePatient(@PathVariable("id") long id)throws Exception{
		service.deletePatient(id);
	}
}
