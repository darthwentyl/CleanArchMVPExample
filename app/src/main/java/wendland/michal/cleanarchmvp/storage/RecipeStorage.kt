package wendland.michal.cleanarchmvp.storage

import wendland.michal.cleanarchmvp.entity.Recipe

class RecipeStorage {
    private lateinit var _recipes : MutableList<Recipe>

    fun getRecipes(): MutableList<Recipe> {
        if(_recipes.isNotEmpty()) {
            return _recipes
        }
        return mutableListOf<Recipe>()
    }

    fun add(recipe: Recipe) {
        _recipes.add(recipe)
    }
}
