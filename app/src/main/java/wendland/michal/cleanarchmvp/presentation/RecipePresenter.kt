package wendland.michal.cleanarchmvp.presentation

import wendland.michal.cleanarchmvp.domain.GetRecipes

class RecipePresenter(private var _recipeView: RecipeView?) {
    private lateinit var _getRecipes : GetRecipes

    fun onAttach(recipeView: RecipeView) {
        this._recipeView = recipeView
    }

    fun onDetach() {
        _recipeView = null
    }

    fun refreshRecipes(isWithMeat: Boolean) {

    }
}