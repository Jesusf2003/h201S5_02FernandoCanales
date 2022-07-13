package com.azureml.domain;

import java.math.BigDecimal;

import lombok.*;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Output {

	private String column1;
	private Integer column2;
	private Integer column3;
	private String column4;
	private String column5;
	private String column6;
	private String column7;
	private Integer column8;
	private String column9;
	private String column10;
	private Integer column11;
	private String column12;
	private String column13;
	private Integer column14;
	private Integer column15;
	private Integer column16;
	private BigDecimal scored_labels;
	private BigDecimal scored_probabilities;
}