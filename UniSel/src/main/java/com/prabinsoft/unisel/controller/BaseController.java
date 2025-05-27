package com.prabinsoft.unisel.controller;



import org.springframework.beans.factory.annotation.Autowired;

import com.prabinsoft.unisel.config.CustomMessageSource;
import com.prabinsoft.unisel.enums.ResponseStatus;
import com.prabinsoft.unisel.generic.GlobalApiResponse;

public class BaseController {

	@Autowired
	protected CustomMessageSource customMessageSource;
	private static final ResponseStatus API_SUCCESS_STATUS = ResponseStatus.SUCCESS;
	private static final ResponseStatus API_FAIL_STATUS = ResponseStatus.FAIL;
	protected String module;
	
	
	public GlobalApiResponse successResponse(String message, Object data) {
		GlobalApiResponse globalApiResponse = new GlobalApiResponse();
		globalApiResponse.setResponseStatus(API_SUCCESS_STATUS);
		globalApiResponse.setMessage(message);
		globalApiResponse.setData(data);
		return globalApiResponse;
	}
	
}
