/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 *
 * @author HP
 */
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

import Model.Doctor;
import Service.Service;


@RestController
@RequestMapping("hospital")
public class doctorController {
    @Autowired
	Service service;
    @RequestMapping("/doctors")
	List<Doctor> showAllDoctors(){
		List<Doctor> listAllDoctors= new ArrayList<>();
		listAllDoctors=service.showAllDoctors();
		return listAllDoctors;
	}
	
	@RequestMapping("/doctors/viewByName/{name}")
	List<Map<String, Object>> doctorViewByName(@PathVariable("name") String name ) {
		return service.searchDoctorByName(name);
	}
	
	@RequestMapping("/doctors/viewById/{id}")
	Doctor doctorViewById(@PathVariable("id") long id) {
		return service.searchDoctorById(id);
	}
	
	@RequestMapping(value="/doctors/addDoctor",method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(value = HttpStatus.OK)
	void addDoctor(@RequestBody Doctor doctor) throws Exception{
		service.createDoctor(doctor);
	}
	
	@RequestMapping(value="/doctors/updateDoctor/{id}",method=RequestMethod.PUT,consumes=MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(value=HttpStatus.OK)
	void updateDoctor(@PathVariable("id") long id, @RequestBody Doctor doctor) throws Exception{
		doctor.setId(id);
		service.updateDoctor(doctor);
	}
	
	@RequestMapping(value="/doctors/deleteDoctor/{id}",method=RequestMethod.DELETE)
	@ResponseStatus(value=HttpStatus.OK)
	void deleteDoctor(@PathVariable("id") long id)throws Exception{
		service.deleteDoctor(id);
	}
}
