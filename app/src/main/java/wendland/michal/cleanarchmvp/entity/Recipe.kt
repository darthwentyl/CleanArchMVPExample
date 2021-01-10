package wendland.michal.cleanarchmvp.entity

class Recipe(
    private val _name: String,
    private val _description: String,
    private val _isMeat: Boolean
) {
    val getTitle
        get() = _name

    val getDescription
        get() = _description

    val isMeat
        get() = _isMeat
}