package wendland.michal.cleanarchmvp.presentation

import wendland.michal.cleanarchmvp.entity.Recipe

interface RecipeView {
    fun updateRecipes(recipes : MutableList<Recipe>)
}