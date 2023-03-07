object FoldRight2 {
  def main(args: Array[String]): Unit = {
    val list = List(1, 2, 3, 4, 5)
    println(mul(list))
  }
  def mul(list: List[Int]): Int =  list.foldRight(1)((a, b) => a * b)
}
