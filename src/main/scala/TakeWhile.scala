object TakeWhile {
  def main(args: Array[String]): Unit = {
val list = List(1,2,3,4,5,6)
    println(takeWhile(list)(x => x < 3))
  }
  def takeWhile[T](list: List[T])(f: T => Boolean): List[T] = list match {
    case x::xs if f(x) => x::takeWhile(xs)(f)  //リストの先頭から順に要素を取り出して、述語fを満たす要素が見つかるまでリストに追加します。述語fを満たさない要素が見つかると、以降の要素は破棄され、空のリストが返されます。
    case _ =>   Nil
  }
}
