package com.prabinsoft.unisel.service;

import java.util.List;
import java.util.Map;

import com.prabinsoft.unisel.pojo.UniversityRequestPojo;
import com.prabinsoft.unisel.pojo.UniversityResponsePojo;

public interface UniversityService {
	
	void createUpdateUniversity(UniversityRequestPojo uniRequestPojo);
	UniversityResponsePojo getUniversityById(Integer id);
	UniversityResponsePojo getUniversityByName(String name);
	List<UniversityResponsePojo> getAllUniversity();
	void deleteUniversityById(Integer id);

	
	// new services
//	List<UniversityResponsePojo> searchUniversities(String keyword); // e.g., name, city, country
//	List<UniversityResponsePojo> filterByRankingRange(int min, int max);
//	List<UniversityResponsePojo> filterByTuitionFeeRange(Double min, Double max);
//	List<UniversityResponsePojo> filterByGPAAndIELTS(Double gpa, Double ielts);
//	
//	
//	void activateUniversity(Integer id);
//	void deactivateUniversity(Integer id);
//	List<UniversityResponsePojo> getActiveUniversities();
//	List<UniversityResponsePojo> getInactiveUniversities();
//	
//	boolean universityExistsByName(String name);
//	boolean universityExistsById(Integer id);
//
//	void bulkInsertUniversities(List<UniversityRequestPojo> universities);
//	void bulkDeleteByIds(List<Integer> ids);
//
//	Long getTotalUniversityCount();
//	Double getAverageTuitionFee();
//	Map<String, Long> getUniversityCountByCountry(); // Assuming country field exists

	

}
