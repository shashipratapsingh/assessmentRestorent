package com.Assignment.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Assignment.entity.RecipesEntity;
import com.Assignment.repository.RecipesRepository;





@Service
public class RecipesService {
	@Autowired 
	private RecipesRepository recipesRepository;
	
	//add single recipes
	public RecipesEntity saveRecipesEntity(RecipesEntity recipesEntity)
	{
		return recipesRepository.save(recipesEntity);
	}
	
	//Add list of recipes
		public List<RecipesEntity> saverecipes(List<RecipesEntity> recipesEntity)
		 {
			return recipesRepository.saveAll(recipesEntity);
			 
		 }
		
		

		//Fatch list of Recipes
		public List<RecipesEntity> getRecipes()
		 {
			return recipesRepository.findAll();
			 
		 }
		
//		Fatch singh Recipes list find by id
		public RecipesEntity getrecipesById(int id)
		 {
			return recipesRepository.findById(id).orElse(null);
			 
		 }
		
//		Fatch singh Recipes list find by name 
		public RecipesEntity getRecipestByRecipesName(String recipesName)
		 {
			return recipesRepository.findByRecipesName(recipesName);
			 
		 }
		
		
		
//		Delete data by Id
		public String deleteRecipes(int id)
		 {
			
			recipesRepository.deleteById(id);
			 return "Recipes Removed " +id;
			 
		 }
		
		//update Recipes
		
		public RecipesEntity updaterecipes(RecipesEntity recipesEntity)
		 {
			RecipesEntity exRecipes=recipesRepository.findById(recipesEntity.getId()).orElse(null);
			exRecipes.setRecipesName(recipesEntity.getRecipesName());
			exRecipes.setTypeOfrecipes(recipesEntity.getTypeOfrecipes());
			return recipesRepository.save(exRecipes);
			 
		 }
		
		       //find by date of Order
		
				public RecipesEntity getRecipestByOrdertime(LocalDateTime localDateTime)
				{
					return recipesRepository.findbyordertime(localDateTime);
				}
}
