package com.prabinsoft.unisel.pojo;

import java.time.LocalDate;

import jakarta.validation.constraints.DecimalMax;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UniversityRequestPojo {

	private Integer id;
	@NotBlank(message = "University name is required")
	private String name;
	@NotBlank(message = "Address is required")
	private String address;
	@NotNull(message = "Tuition fee must not be null")
	@Positive(message = "Tuition fee must be positive")
	private Double tuitionFee;
	@NotNull(message = "Ranking is required")
	@Min(value = 1, message = "Ranking must be at least 1")
	private Integer ranking;
	@NotNull(message = "Deadline is required")
	@Future(message = "Deadline must be a future date")
	private LocalDate deadline;
	@NotNull(message = "Cost of attendance is required")
	@Positive(message = "Cost of attendance must be positive")
	private Double costOfAttendance;
	@NotNull(message = "Scholarship availability must be specified")
	private Boolean scholarshipAvailable;
	@NotNull(message = "Minimum GPA is required")
	@DecimalMin(value = "0.0", inclusive = false, message = "GPA must be greater than 0")
	@DecimalMax(value = "4.0", message = "GPA must be less than or equal to 4.0")
	private Double minGPA;
	@NotNull(message = "Minimum IELTS score is required")
	@DecimalMin(value = "0.0", inclusive = false, message = "IELTS must be greater than 0")
	@DecimalMax(value = "9.0", message = "IELTS must be less than or equal to 9.0")
	private Double minIelts;
	@NotBlank(message = "Weather description is required")
	private String weather;
	@NotNull(message = "Acceptance rate is required")
	@DecimalMin(value = "0.0", inclusive = true)
	@DecimalMax(value = "100.0", message = "Acceptance rate must be between 0 and 100")
	private Double acceptanceRate;

}
