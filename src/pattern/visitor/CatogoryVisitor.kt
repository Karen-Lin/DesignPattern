package pattern.visitor

import pattern.visitor.data.Book
import pattern.visitor.data.Fruit
import pattern.visitor.data.Game

class CategoryVisitor: ProductVisitor {

    var fruits = ArrayList<Fruit>()
    var books = ArrayList<Book>()
    var games = ArrayList<Game>()

    override fun visit(fruit: Fruit) {
        fruits.add(fruit)
    }

    override fun visit(book: Book) {
        books.add(book)
    }

    override fun visit(game: Game) {
        games.add(game)
    }

    fun printInfo() {
        println("總共有 ${fruits.size} 個水果, $fruits")
        println("總共有 ${books.size} 本書, $books")
        println("總共有 ${games.size} 片遊戲, $games")
    }
}