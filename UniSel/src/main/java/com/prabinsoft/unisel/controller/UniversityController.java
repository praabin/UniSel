package com.prabinsoft.unisel.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prabinsoft.unisel.constants.ModuleNameConstants;
import com.prabinsoft.unisel.enums.Message;
import com.prabinsoft.unisel.generic.GlobalApiResponse;
import com.prabinsoft.unisel.pojo.UniversityRequestPojo;
import com.prabinsoft.unisel.pojo.UniversityResponsePojo;
import com.prabinsoft.unisel.repository.UniversityRepository;
import com.prabinsoft.unisel.service.UniversityService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
//import io.swagger.v3.oas.annotations.media.Content;
//import io.swagger.v3.oas.annotations.media.Schema;
//import io.swagger.v3.oas.annotations.responses.ApiResponse;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/university")
@Tag(name=ModuleNameConstants.UNIVERSITY)
public class UniversityController extends BaseController {

//    private final UniversityRepository universityRepository;
	private final UniversityService universityService;

	public UniversityController(UniversityService universityService, UniversityRepository universityRepository) {
		this.universityService = universityService;
		this.module = ModuleNameConstants.UNIVERSITY;
//		this.universityRepository = universityRepository;
		
	}
		
	
	@PostMapping
	public ResponseEntity<GlobalApiResponse> createUpdate(@Valid @RequestBody UniversityRequestPojo universityRequestPojo){
		universityService.createUpdateUniversity(universityRequestPojo);
		return ResponseEntity.ok(successResponse(customMessageSource.get(Message.SAVE.getCode(), module),null));
	}
	
	@GetMapping
	public ResponseEntity<GlobalApiResponse> getAll(){
		return ResponseEntity.ok(successResponse(customMessageSource.get(Message.CRUD_GET_ALL.getCode(), module),universityService.getAllUniversity()));
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<GlobalApiResponse> getUniversityById(@PathVariable Integer id){
		return ResponseEntity.ok(successResponse(customMessageSource.get(Message.CRUD_GET_SINGLE.getCode(), module),universityService.getUniversityById(id)));
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<GlobalApiResponse> deleteUniversityById(@PathVariable Integer id){
		universityService.deleteUniversityById(id);
		return ResponseEntity.ok(successResponse(customMessageSource.get(Message.DELETE.getCode(), module),null));
	}

}
