package com.Assignment.controller;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.Assignment.entity.RecipesEntity;
import com.Assignment.service.RecipesService;



@RestController
public class RecipesController {
	@Autowired 
	private RecipesService recipesService;
	
		//add single recipes
		@PostMapping("/addrecipe")
		public RecipesEntity addRecipes(@RequestBody RecipesEntity recipesEntity)
		{
			return recipesService.saveRecipesEntity(recipesEntity);
		}
		
		//add list recipes
		@PostMapping("/addrecipes")
		
		public List<RecipesEntity> addrepices(@RequestBody List<RecipesEntity> recipesEntity)
		{
			return recipesService.saverecipes(recipesEntity);
		}
		
		
		
		
		   //find recipes of list	
			@GetMapping("/recipes")
			public List<RecipesEntity> findAllrecipes()
			{
				return recipesService.getRecipes();
			}
			
		   //find by id recipes of list
			@GetMapping("/recipesById/{id}")
			public RecipesEntity findRecipesById(@PathVariable int id)
			{
				//return recipesService.getProductById(id);
				return recipesService.getrecipesById(id);
			}
			
		        //find by Name recipes of list
		    	@GetMapping("/recipes/{recipesName}")
				public RecipesEntity findRecipesByName(@PathVariable String recipesName)
				{
					return recipesService.getRecipestByRecipesName(recipesName);
				}
		    	

				//find by date of Order
		    	@GetMapping("/recipesorder/{localDateTime}")
				public RecipesEntity getRecipestByOrdertime(@PathVariable LocalDateTime localDateTime)
				{
					return recipesService.getRecipestByOrdertime(localDateTime);
				}
			
			//update 
			@PutMapping("/recipesUpdate")
			
			public RecipesEntity updateRecipes(@RequestBody RecipesEntity recipesEntity)
			{
				return recipesService.updaterecipes(recipesEntity);
			}
			
			
			//Delete
			@DeleteMapping("/delete/{id}")
			@ResponseBody
			public String deleteRecipes(@PathVariable int  id)
			{
				return recipesService.deleteRecipes(id);
			}

}
