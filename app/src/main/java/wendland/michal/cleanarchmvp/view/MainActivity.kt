package wendland.michal.cleanarchmvp.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.TextView
import wendland.michal.cleanarchmvp.R
import wendland.michal.cleanarchmvp.entity.Recipe
import wendland.michal.cleanarchmvp.presentation.RecipePresenter
import wendland.michal.cleanarchmvp.presentation.RecipeView

class MainActivity : AppCompatActivity(), RecipeView {

    private val _recipePresenter: RecipePresenter = RecipePresenter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        _recipePresenter.onAttach(this)

        val refresh = findViewById<Button>(R.id.refresh)
        refresh.setOnClickListener{
            val withMeat = findViewById<CheckBox>(R.id.withMeat)
            _recipePresenter.refreshRecipes(withMeat.isChecked)
        }

    }

    override fun onDestroy() {
        super.onDestroy()
        _recipePresenter.onDetach()
    }

    override fun updateRecipes(recipes : MutableList<Recipe>) {
        val recipesTextView = findViewById<TextView>(R.id.recipes)
        var text = String()
        for (item in recipes) {
            text += item.getTitle + " " + item.getDescription + "\n"
        }
        recipesTextView.text = text
    }

}