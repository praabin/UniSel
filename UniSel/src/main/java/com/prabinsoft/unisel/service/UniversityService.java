package com.prabinsoft.unisel.service;

import java.util.List;

import com.prabinsoft.unisel.pojo.UniversityRequestPojo;
import com.prabinsoft.unisel.pojo.UniversityResponsePojo;

public interface UniversityService {
	
	void createUpdateUniversity(UniversityRequestPojo uniRequestPojo);
	UniversityResponsePojo getUniversityById(Integer id);
	UniversityResponsePojo getUniversityByName(String name);
	List<UniversityResponsePojo> getAllUniversity();
	void deleteUniversityById(Integer id);

}
