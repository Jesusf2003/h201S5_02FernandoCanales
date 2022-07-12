package com.azureml.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.azureml.domain.Aproval;
import com.azureml.service.AprovalService;

@RestController
@RequestMapping("/api")
@CrossOrigin(value = "http://localhost:4200")
public class AprovalController {
    
    @Autowired
	private AprovalService cancerService;
	
	@PostMapping
	public String consultApi(@RequestBody Aproval aproval) {
		return cancerService.consultApi(aproval);
	}
}