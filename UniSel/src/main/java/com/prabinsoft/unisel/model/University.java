package com.prabinsoft.unisel.model;

import java.time.LocalDate;

import com.prabinsoft.unisel.generic.AuditActiveAbstract;

import jakarta.persistence.Column;
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
@Table(name = "tbl_university")
public class University extends AuditActiveAbstract {

	@Id
	@SequenceGenerator(name = "university_seq_name", sequenceName = "university_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "university_seq_name")
	private Integer id;
	@Column(nullable = false, length = 100)
	private String name;
	@Column(length = 200)
	private String address;
	@Column(name = "tuition_fee")
	private Double tuitionFee;
	private Integer ranking;
	private LocalDate deadline;
	@Column(name = "cost_of_attendance")
	private Double costOfAttendance;
	private Boolean scholarshipAvailable;
	@Column(name = "min_gpa")
	private Double minGPA;
	@Column(name = "min_ielts")
	private Double minIelts;
	private String weather;
	@Column(name = "acceptance_rate")
	private Double acceptanceRate;
}
