package pattern.composite

interface Meal {
    fun add(meal: Meal)
    fun remove(meal: Meal)
    fun display()
}