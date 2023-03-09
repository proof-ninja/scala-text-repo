object FlatMap {
  def main(args: Array[String]): Unit = {
    val list = List(List(1, 2, 3), List(4, 5))
    println(flatMap(list)(e => e.map{g => g + 1}))
  }

  def flatMap[T, U](list: List[T])(f: T => List[U]): List[U] = {
    list match {
      case Nil => Nil   //リストが空である場合には空のリストを返します
      case x::xs => f(x) ::: flatMap(xs)(f) //リストの先頭要素 x に対して関数 f を適用し、その結果をリストに追加。::: は、Scalaのリスト（List）クラスのメソッドで、2つのリストを連結して新しいリストを作成するために使用されます。
    }
  }
}
