package wendland.michal.cleanarchmvp.presentation

import wendland.michal.cleanarchmvp.domain.GetRecipes

class RecipePresenter {
    private var _recipeView: RecipeView? = null
    private var _getRecipes : GetRecipes = GetRecipes()

    fun onAttach(recipeView: RecipeView) {
        this._recipeView = recipeView
    }

    fun onDetach() {
        _recipeView = null
    }

    fun refreshRecipes(isWithMeat: Boolean) {
        _recipeView?.updateRecipes(_getRecipes.getReceipes(isWithMeat))
    }
}