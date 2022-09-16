package com.bnt.model;

import java.math.BigDecimal;

public class CurrencyExchange {
	
	private Long id;
	private String from;
	private String to;
	private BigDecimal conversionMultiple;
	private String environment;
	
	public CurrencyExchange() {
		super();
	}

	

	public CurrencyExchange(Long id, String from, String to, BigDecimal conversionMultiple, String environment) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.conversionMultiple = conversionMultiple;
		this.environment = environment;
	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public String getEnvironment() {
		return environment;
	}

	public void setEnvironment(String environment) {
		this.environment = environment;
	}
	
	
	

	public BigDecimal getConversionMultiple() {
		return conversionMultiple;
	}



	public void setConversionMultiple(BigDecimal conversionMultiple) {
		this.conversionMultiple = conversionMultiple;
	}



	@Override
	public String toString() {
		return "CurrencyExchange [id=" + id + ", from=" + from + ", to=" + to + ", environment=" + environment + "]";
	}
	
	

}
