package com.prabinsoft.unisel.mapper;

import java.util.List;
import java.util.Optional;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.prabinsoft.unisel.pojo.UniversityResponsePojo;

@Mapper
public interface UniversityMapper {

	@Select("""
			select tu.id, tu.\"name\", tu.address, tu.tuition_fee as tuitionFee, tu.ranking,
			tu.deadline, tu.cost_of_attendance as costOfAttendance,
			tu.scholarship_available as scholarshipAvailable, tu.min_gpa as minGPA, tu.min_ielts as minIELTS,
			tu.weather, tu.acceptance_rate as acceptanceRate from tbl_university tu where tu.is_active""")
	List<UniversityResponsePojo> getAllUniversity();
	
	@Select("""
			select tu.id, tu.\"name\", tu.address, tu.tuition_fee as tuitionFee, tu.ranking,
			tu.deadline, tu.cost_of_attendance as costOfAttendance,
			tu.scholarship_available as scholarshipAvailable, tu.min_gpa as minGPA, tu.min_ielts as minIELTS,
			tu.weather, tu.acceptance_rate as acceptanceRate from tbl_university tu where tu.id = #{id} and tu.is_active""")
	Optional<UniversityResponsePojo> getUniversityById(@Param("id") Integer id);
	
	@Select("""
			select tu.id, tu.\"name\", tu.address, tu.tuition_fee as tuitionFee, tu.ranking,
			tu.deadline, tu.cost_of_attendance as costOfAttendance,
			tu.scholarship_available as scholarshipAvailable, tu.min_gpa as minGPA, tu.min_ielts as minIELTS,
			tu.weather, tu.acceptance_rate as acceptanceRate from tbl_university tu where tu.name = #{name} and tu.is_active """)
	Optional<UniversityResponsePojo> getUniversityByName(@Param("name") String name);
	
}
