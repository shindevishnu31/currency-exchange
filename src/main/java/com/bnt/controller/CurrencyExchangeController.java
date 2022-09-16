package com.bnt.controller;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bnt.model.CurrencyExchange;

@RestController
@RequestMapping("/currency-exchange")
public class CurrencyExchangeController {
		
	@Autowired
	private Environment environment;
		
		
	@GetMapping("/from/{from}/to/{to}")
	public CurrencyExchange getCurrencyExchangeRate(
			@PathVariable String from,
			@PathVariable String to
			) {
		String port = environment.getProperty("local.server.port");
		return new CurrencyExchange(1000L, from, to, BigDecimal.valueOf(90), port);
	}

}
