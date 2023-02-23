package com.in28minutes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/currency")
public class CurrencyServiceController {
	
	@Autowired
	private CurrencyServiceConfiguration currencyServiceConfiguration;
	
	@GetMapping
	public CurrencyServiceConfiguration getCurrency() {
		return currencyServiceConfiguration;
	}

}
