package wendland.michal.cleanarchmvp.entity

class Recipe(
    private var _name: String,
    private var _description: String,
    private var _isMeat: Boolean
) {
    val getTitle
        get() = _name

    val getDescription
        get() = _description

    val isMeat
        get() = _isMeat
}