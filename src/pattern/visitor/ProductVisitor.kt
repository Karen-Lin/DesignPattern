package pattern.visitor

import pattern.visitor.data.Book
import pattern.visitor.data.Fruit
import pattern.visitor.data.Game

interface ProductVisitor {
    fun visit(fruit: Fruit)
    fun visit(book: Book)
    fun visit(game: Game)
}