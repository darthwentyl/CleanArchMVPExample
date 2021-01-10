package wendland.michal.cleanarchmvp.storage

import wendland.michal.cleanarchmvp.entity.Recipe

class RecipeStorage {
    private lateinit var _recipes : MutableList<Recipe>

    val getRecipes : MutableList<Recipe>
        get() = _recipes

    fun add(recipe: Recipe) {
        _recipes.add(recipe)
    }
}
