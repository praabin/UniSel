package com.prabinsoft.unisel.repository;

import org.apache.ibatis.annotations.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.prabinsoft.unisel.model.University;

public interface UniversityRepository extends JpaRepository<University, Integer>{
	//let's implement soft delete rather that hard delete

	@Modifying
	@Query(value ="update tbl_university set is_active = false where id = :id", nativeQuery = true)
	void deleteById(@Param("id") Integer id);

}
