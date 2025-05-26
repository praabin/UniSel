package com.prabinsoft.unisel.generic;

import com.prabinsoft.unisel.enums.ResponseStatus;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class GlobalApiResponse {
	private ResponseStatus responseStatus;
	private String message;
	private Object data;

}
