object Map {
  def main(args: Array[String]): Unit = {
    val list = List(1,2,3,4)
    println(map(list)(x => x.toString))
  }
  def map[T, U](list: List[T])(f: T => U): List[U] = {
    list.foldLeft(Nil: List[U]){(x, y) => f(y) :: x}.reverse
  }
}
