package com.prabinsoft.unisel.service;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import com.prabinsoft.unisel.config.CustomMessageSource;
import com.prabinsoft.unisel.constants.ModuleNameConstants;
import com.prabinsoft.unisel.customexception.AppException;
import com.prabinsoft.unisel.enums.Message;
import com.prabinsoft.unisel.model.University;
import com.prabinsoft.unisel.pojo.UniversityRequestPojo;
import com.prabinsoft.unisel.pojo.UniversityResponsePojo;
import com.prabinsoft.unisel.repository.UniversityRepository;
import com.prabinsoft.unisel.utils.NullAwareBeanUtilsBean;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UniversitySeriviceImpl implements UniversityService {

	private final UniversityRepository universityRepository;
	private final NullAwareBeanUtilsBean nullAwareBeanUtilsBean = new NullAwareBeanUtilsBean();
	private final CustomMessageSource customMessageSource;

	@Override
	public void createUpdateUniversity(UniversityRequestPojo uniRequestPojo) {
		University university;
		if (uniRequestPojo.getId() != null) {
			university = universityRepository.findById(uniRequestPojo.getId()).orElse(new University());
		} else {
			university = new University();
		}

		try {
			nullAwareBeanUtilsBean.copyProperties(university, uniRequestPojo);
		} catch (IllegalAccessException | InvocationTargetException e) {
			throw new AppException(e.getMessage());
		}

		try {
			universityRepository.save(university);
		} catch (DataIntegrityViolationException e) {
			throw new AppException(
					customMessageSource.get(Message.ALREADY_EXISTS.getCode(), ModuleNameConstants.UNIVERSITY));
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
