package com.neo.springrecipeapp.repositories;

import com.neo.springrecipeapp.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}