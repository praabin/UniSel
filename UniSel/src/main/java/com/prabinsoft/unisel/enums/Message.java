package com.prabinsoft.unisel.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Message {
	SAVE("success.save"),
	UPDATE("success.update"),
	ALREADY_EXISTS("already.exists"),
	ID_NOT_FOUND("id.not.found"),
	CRUD_GET_SINGLE("crud.get.single"),
	CRUD_GET_ALL("crud.get_all"),
	DELETE("success.delete");
		
	public String code;

}
