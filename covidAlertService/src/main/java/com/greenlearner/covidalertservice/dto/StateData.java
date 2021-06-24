package com.greenlearner.covidalertservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StateData {

	private String loc;
	private Integer confirmedCasesIndian;
	private Integer confirmedCasesForeign;
	private Integer discharged;
	private Integer deaths;
	private Integer totalConfirmed;
}
