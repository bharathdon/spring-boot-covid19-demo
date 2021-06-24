package com.greenlearner.covidalertservice.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AlertStatus {

	private String alertLevel;
	private List<String> measuresToBeTaken;
	
	private StateData stateData;
}
