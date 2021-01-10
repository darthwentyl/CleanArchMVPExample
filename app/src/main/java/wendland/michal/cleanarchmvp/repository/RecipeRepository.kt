package wendland.michal.cleanarchmvp.repository

import wendland.michal.cleanarchmvp.entity.Recipe
import wendland.michal.cleanarchmvp.storage.RecipeStorage

class RecipeRepository {
    private lateinit var _recipeStorage : RecipeStorage

    init {
        this._recipeStorage.add(Recipe("VEGE_1", "VEGE_1 Description", false))
        this._recipeStorage.add(Recipe("VEGE_2", "VEGE_2 Description", false))
        this._recipeStorage.add(Recipe("VEGE_3", "VEGE_3 Description", false))
        this._recipeStorage.add(Recipe("MEAT_1", "MEAT_1 Description", true))
        this._recipeStorage.add(Recipe("MEAT_2", "MEAT_2 Description", true))
        this._recipeStorage.add(Recipe("MEAT_3", "MEAT_3 Description", true))
    }

    val getRecipes : MutableList<Recipe>
        get() = _recipeStorage.getRecipes

}