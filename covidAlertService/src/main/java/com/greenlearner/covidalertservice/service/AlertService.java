package com.greenlearner.covidalertservice.service;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greenlearner.covidalertservice.dto.AlertStatus;
import com.greenlearner.covidalertservice.dto.StateData;
import com.greenlearner.covidalertservice.dto.SummaryData;

@Service
public class AlertService {

	@Autowired
	private Covid19DataProvider covid19DataProvider;

	public AlertStatus getAlertAboutState(String state) {

		AlertStatus alertStatus = new AlertStatus();

		StateData stateData = covid19DataProvider.getStateData(state);
		alertStatus.setStateData(stateData);

		if (stateData.getTotalConfirmed() < 1000) {

			alertStatus.setAlertLevel("GREEN");
			alertStatus.setMeasuresToBeTaken(Arrays.asList("everything is normal !!"));

		} else if (stateData.getTotalConfirmed() > 1000 && stateData.getTotalConfirmed() < 10000) {
			alertStatus.setAlertLevel("ORANGE");
			alertStatus.setMeasuresToBeTaken(Arrays.asList("partial lockdown !!", "essentials are allowed"));

		} else if (stateData.getTotalConfirmed() > 10000) {
			alertStatus.setAlertLevel("RED");
			alertStatus.setMeasuresToBeTaken(Arrays.asList("FULL lockdown !!", "medical s are allowed"));
		}

		return alertStatus;
	}

	public SummaryData getOverAllSummary() {
		return covid19DataProvider.getSummaryData("summary");
	}

}
