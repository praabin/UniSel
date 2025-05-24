package com.prabinsoft.unisel.pojo;

import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UniversityRequestPojo {
	
	private Integer id;
	private String name;
	private String address;
	private Double tutionFee;
	private Integer ranking;
	private LocalDate deadline;
	private Double costOfAttendance;
	private Boolean scholarshipAvailable;
	private Double minGPA;
	private Double minIelts;
	private String weather;

}
