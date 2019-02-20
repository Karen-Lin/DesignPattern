package pattern.iterator

interface Iterator {

    // 是否有下一個元素
    operator fun hasNext(): Boolean

    // 取得下一個元素
    operator fun next(): Any

}