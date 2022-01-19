package com.vaibhav.maximaBackendTask.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vaibhav.maximaBackendTask.Model.Data;
import com.vaibhav.maximaBackendTask.Repository.DataRepository;
@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class MyController {

	@Autowired
	private DataRepository dataRepository;
	
	@GetMapping("/")
	public String home() {
		return ("<h1>Welcome</h1>");

	}

	// Get details
	@GetMapping("/getdata")
	public List<Data> getdata() {
		return this.dataRepository.findAll();
	}

}
