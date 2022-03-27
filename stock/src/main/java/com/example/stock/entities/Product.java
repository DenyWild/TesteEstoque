package com.example.stock.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Data
@Entity
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@NotBlank
	private String name;
	@NotNull
	private double price;
	@NotBlank
	private String unity;
	@NotNull
	private double minStock;
	@NotNull
	@ManyToOne
	@JoinColumn(name = " id_user ", referencedColumnName = " id ", nullable = false)
	@JsonIgnore
	private Category category;

}
