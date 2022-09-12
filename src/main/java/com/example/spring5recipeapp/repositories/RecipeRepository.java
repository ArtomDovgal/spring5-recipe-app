package com.example.spring5recipeapp.repositories;

import com.example.spring5recipeapp.domain.Recipe;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;

public interface RecipeRepository extends CrudRepository<Recipe,Long> {


}
