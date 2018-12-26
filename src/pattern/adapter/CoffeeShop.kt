package pattern.adapter

class CoffeeShop {

    fun buyCoffee(payment : Payment) {
        payment.also { println("付款方式：${it.pay()}") }
    }
}