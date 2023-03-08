object Filter {
  def main(args: Array[String]): Unit = {
    val list = List(1,2,3,4,5)
    println(filter(list)(x => x % 2 == 0))
  }

  def filter[T](list: List[T])(f: T => Boolean): List[T] = {
    list.foldLeft(Nil:List[T])((x, y) => (if (f(y)) (y::x) else (x))).reverse
  }
}
