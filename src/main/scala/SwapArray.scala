class SwapArray {
  def swapArray[T](arr: Array[T])(i: Int, j: Int): Unit = {
    val esc = arr(i)
    arr(i) = arr(j)
    arr(j) = esc
  }
}
  object SwapArray{
  def main(args: Array[String]): Unit = {
    val array1 = Array(1,2,3,4,5)
    val swapArray = new SwapArray()
    swapArray.swapArray(array1)( 0, 4)
    println(array1.mkString(","))
    swapArray.swapArray(array1)( 1, 3)
    println(array1.mkString(","))
  }
}
