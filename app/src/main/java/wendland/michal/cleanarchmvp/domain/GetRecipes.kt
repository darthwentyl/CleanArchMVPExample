package wendland.michal.cleanarchmvp.domain

import wendland.michal.cleanarchmvp.entity.Recipe
import wendland.michal.cleanarchmvp.repository.RecipeRepository

class GetRecipes {
    private lateinit var _recipeRepository : RecipeRepository

    fun getReceipes(isWithMeat : Boolean) : MutableList<Recipe> {
        var filteredRecipes = mutableListOf<Recipe>()
        for (item in _recipeRepository.getRecipes()) {
            if (item.isMeat == isWithMeat) {
                filteredRecipes.add(item)
            }
        }
        return filteredRecipes
    }
}