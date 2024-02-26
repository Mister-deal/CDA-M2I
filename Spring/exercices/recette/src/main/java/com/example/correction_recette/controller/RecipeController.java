package com.example.correction_recette.controller;

import com.example.correction_recette.entity.Recipe;
import com.example.correction_recette.repository.RecipeRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/recipes")
public class RecipeController {

    private final RecipeRepository recipeRepository;

    public RecipeController(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }


    @GetMapping
    public String listRecipes(Model model) {
        model.addAttribute("recipes", recipeRepository.findAll());
        return "recipes/list";
    }


    @GetMapping("/add")
    public String showAddForm(Model model) {
        model.addAttribute("recipe", new Recipe());
        return "recipes/add";
    }


    @PostMapping("/add")
    public String addRecipe(Recipe recipe) {
        recipeRepository.save(recipe);
        return "redirect:/recipes";
    }

    @GetMapping("/search/name")
    public String searchByName(@RequestParam("name") String name, Model model) {
        model.addAttribute("recipes", recipeRepository.findByNameContainingIgnoreCase(name));
        return "recipes/list";
    }

    @GetMapping("/search/ingredient")
    public String searchByIngredient(@RequestParam("ingredient") String ingredient, Model model) {
        model.addAttribute("recipes", recipeRepository.findByIngredientsContainingIgnoreCase(ingredient));
        return "recipes/list";
    }

    @GetMapping("/{id}")
    public String showRecipeDetails(@PathVariable("id") Long id, Model model) {
        Recipe recipe = recipeRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid recipe Id:" + id));
        model.addAttribute("recipe", recipe);
        return "recipes/details";
    }
}

