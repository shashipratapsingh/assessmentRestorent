package com.Assignment.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Recipes_list")
public class RecipesEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String recipesName;
	private String typeOfrecipes;

	@Column(name = "order_date_time", columnDefinition = "TIMESTAMP")
	private LocalDateTime localDateTime;
  
	
	
	
	
	//Not working	
	//@Column(name = "local_time", columnDefinition = "TIME")
	//private LocalTime localTime;
	
	//@Column(name = "local_date", columnDefinition = "DATE")
	//private LocalDate localDate;
}
