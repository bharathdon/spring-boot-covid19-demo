package com.greenlearner.covidalertservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.greenlearner.covidalertservice.dto.AlertStatus;
import com.greenlearner.covidalertservice.dto.SummaryData;
import com.greenlearner.covidalertservice.service.AlertService;

@RestController
public class AlertController {

	@Autowired
	private AlertService alertServie;

	@GetMapping("/india/{state}")
	public AlertStatus getAlertAboutState(@PathVariable String state) {
		return alertServie.getAlertAboutState(state);

	}

	@GetMapping("/india/summary")
	public SummaryData getOverAllSummary() {
		return alertServie.getOverAllSummary();

	}
}
