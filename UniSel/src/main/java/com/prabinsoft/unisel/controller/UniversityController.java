package com.prabinsoft.unisel.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prabinsoft.unisel.config.CustomMessageSource;
import com.prabinsoft.unisel.constants.ModuleNameConstants;
import com.prabinsoft.unisel.enums.Message;
import com.prabinsoft.unisel.generic.GlobalApiResponse;
import com.prabinsoft.unisel.pojo.UniversityRequestPojo;
import com.prabinsoft.unisel.pojo.UniversityResponsePojo;
import com.prabinsoft.unisel.service.UniversityService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/university")
//@Tag(name="University")
public class UniversityController extends BaseController {
	private final UniversityService universityService;

	public UniversityController(UniversityService universityService) {
		this.universityService = universityService;
	}
		
	
	@PostMapping
	public ResponseEntity<GlobalApiResponse> createUpdate(@Valid @RequestBody UniversityRequestPojo universityRequestPojo){
		universityService.createUpdateUniversity(universityRequestPojo);
		return ResponseEntity.ok(successResponse(customMessageSource.get(Message.SAVE.getCode(), ModuleNameConstants.UNIVERSITY),null));
	}


}
