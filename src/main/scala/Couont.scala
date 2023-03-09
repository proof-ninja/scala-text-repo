object Count {
  def main(args: Array[String]): Unit = {
    val list = List(1,2,3,4,5)
    println(count(list)(x => x % 2 == 0))

  }
  def count[T](list: List[T])(f: T => Boolean): Int = {
    list.foldLeft(0)((x, y)  => if(f(y)) x + 1 else x)
  }
}
