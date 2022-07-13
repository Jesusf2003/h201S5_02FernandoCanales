package com.azureml.rest;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

import com.azureml.domain.Aproval;
import com.azureml.domain.Output;
import com.azureml.service.AprovalService;

@RestController
@RequestMapping("/api")
@CrossOrigin(value = "http://localhost:4200")
public class AprovalController {

	@Autowired
	private AprovalService service;

	@PostMapping("/consume")
	public String consultApi(@RequestBody Aproval aproval) {
		return service.consultApi(aproval);
	}
}