package wendland.michal.cleanarchmvp.repository

import wendland.michal.cleanarchmvp.entity.Recipe
import wendland.michal.cleanarchmvp.storage.RecipeStorage

class RecipeRepository {
    private var _recipeStorage : RecipeStorage = RecipeStorage()

    init {
        this._recipeStorage.add(Recipe("{VEGE_1}", "[Description VEGE_1]", false))
        this._recipeStorage.add(Recipe("{MEAT_1}", "[Description MEAT_1]", true))
        this._recipeStorage.add(Recipe("{VEGE_2}", "[Description VEGE_2]", false))
        this._recipeStorage.add(Recipe("{MEAT_2}", "[Description MEAT_2]", true))
        this._recipeStorage.add(Recipe("{VEGE_3}", "[Description VEGE_3]", false))
        this._recipeStorage.add(Recipe("{MEAT_3}", "[Description MEAT_3]", true))
    }

    fun getRecipes(): MutableList<Recipe> {
        return _recipeStorage.getRecipes()
    }

}