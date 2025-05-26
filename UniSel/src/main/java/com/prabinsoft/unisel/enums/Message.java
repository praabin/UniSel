package com.prabinsoft.unisel.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Message {
	SAVE("success.save"),
	UPDATE("success.update"),
	ALREADY_EXISTS("already.exists");
	
	
	public String code;

}
