package com.greenlearner.covidalertservice.dto;

import lombok.Data;

@Data
public class CountryData {

	private SummaryData summary;
	private StateData[] regional;
}
