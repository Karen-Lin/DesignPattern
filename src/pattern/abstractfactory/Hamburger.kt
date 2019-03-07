package pattern.abstractfactory

interface Hamburger {

    fun createBread():String
    fun createMeat():String
    fun createVegetable():String
    fun cooking(name: String)
}