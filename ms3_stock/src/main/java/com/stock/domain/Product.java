package com.stock.domain;

import java.math.BigDecimal;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Product {

	private String id;
	private String name;
	private Integer stock;
	private BigDecimal price;
}