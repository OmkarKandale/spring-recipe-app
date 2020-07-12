package com.neo.springrecipeapp.services;

import com.neo.springrecipeapp.domain.Recipe;

import java.util.Set;

public interface RecipeService {
    Set<Recipe> getRecipes();
}
