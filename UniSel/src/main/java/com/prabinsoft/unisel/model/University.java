package com.prabinsoft.unisel.model;

import java.time.LocalDate;

import com.prabinsoft.unisel.generic.AuditActiveAbstract;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name="tbl_university")
public class University extends AuditActiveAbstract {
	
	@Id
	@SequenceGenerator(name ="university_seq_name", sequenceName= "author_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "university_seq_name")
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
