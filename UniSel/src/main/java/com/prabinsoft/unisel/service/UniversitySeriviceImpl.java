package com.prabinsoft.unisel.service;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

import org.springframework.stereotype.Service;

import com.prabinsoft.unisel.customexception.AppException;
import com.prabinsoft.unisel.model.University;
import com.prabinsoft.unisel.pojo.UniversityRequestPojo;
import com.prabinsoft.unisel.pojo.UniversityResponsePojo;
import com.prabinsoft.unisel.repository.UniversityRepository;
import com.prabinsoft.unisel.utils.NullAwareBeanUtilsBean;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UniversitySeriviceImpl implements UniversityService{
	
	private final UniversityRepository universityRepository;
	private final NullAwareBeanUtilsBean nullAwareBeanUtilsBean = new NullAwareBeanUtilsBean();

	@Override
	public void createUpdateUniversity(UniversityRequestPojo uniRequestPojo) {
		University university = new University();
		if(uniRequestPojo.getId() != null) {
			university = universityRepository.findById(uniRequestPojo.getId()).orElse(university);
		}
		
		try {
			nullAwareBeanUtilsBean.copyProperties(university,uniRequestPojo);
		} catch (IllegalAccessException  | InvocationTargetException e) {
		
			throw new AppException(e.getMessage());
		}
		
		try {
		universityRepository.save(university);
		}catch(Exception e) {
			throw new AppException(e.getMessage());
		}
	}

	@Override
	public UniversityResponsePojo getUniversityById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UniversityResponsePojo getUniversityByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UniversityResponsePojo> getAllUniversity() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
		
	}

}
