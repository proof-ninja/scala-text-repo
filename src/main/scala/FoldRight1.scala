object FoldRight1 {

  def main(args: Array[String]): Unit = {
   val list =List(1,2,3,4,5)
   println(sum(list))
  }

  def sum(list: List[Int]):Int = list.foldRight(0)(_ + _) //(_ + _)は((a, b) => a + b)と同じ意味
}
