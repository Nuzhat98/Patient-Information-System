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

import Model.Hospital;
import Service.Service;

@RestController
@RequestMapping("/hospital")
public class hospitalController {
	
	@Autowired
	Service service;
	
	@RequestMapping("/")
	String home() {
		return "<h1>Welcome to Hospital Management System</h1>";
	}
	
	@RequestMapping("/hospital")
	List<Hospital> getHospital(){
		return service.getHospital();
	}
}
