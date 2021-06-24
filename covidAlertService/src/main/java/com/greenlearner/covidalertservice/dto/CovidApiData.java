package com.greenlearner.covidalertservice.dto;

import java.time.ZonedDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CovidApiData {

	private Boolean successs;
	private CountryData data;
	private ZonedDateTime lastRefreshed;
	private ZonedDateTime lastOriginUpdate;
}
