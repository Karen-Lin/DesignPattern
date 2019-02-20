package pattern.flyweight

abstract class Wear {
    protected abstract val clothes: String
    protected abstract val pants: String
    protected abstract val footwear: String
    abstract fun change()
}