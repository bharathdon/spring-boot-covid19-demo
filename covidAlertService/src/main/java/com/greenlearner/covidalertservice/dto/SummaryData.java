package com.greenlearner.covidalertservice.dto;

import java.time.ZonedDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SummaryData {

	private Integer total;
	private Integer confirmedCasesIndian;
	private Integer confirmedCasesForeign;
	private Integer discharged;
	private Integer deaths;
	private Integer confirmedButLocationUnidentified;
	
	private ZonedDateTime updateTime;

}
